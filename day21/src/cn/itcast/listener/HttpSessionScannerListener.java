package cn.itcast.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//�Զ���HttpSessionɨ���������һ��HttpSession���󳬹�1����û�����ˣ������ɵ���
//�����������ڱ���ʱ����������ɾ���е�Ԫ�صġ������java.util.ConcurrentModificationException
//												 java.util.ConcurrentModificationException

public class HttpSessionScannerListener implements HttpSessionListener,
		ServletContextListener {
	private List<HttpSession> sessions = new ArrayList<HttpSession>();// ������е�HttpSession����
	private Object lock = new Object();

	// ������ʱ��
	public void contextInitialized(ServletContextEvent sce) {
		Timer t = new Timer();// ÿ��һ����ɨ��һ��
		t.schedule(new SessionScanTask(sessions,lock), 0, 1 * 60 * 1000);// ����ɨ������
	}

	// �õ�һ�����Ự����
	public void sessionCreated(HttpSessionEvent se) {
		synchronized (lock) {
			HttpSession session = se.getSession();
			System.out.println(session + "����");
			sessions.add(session);
		}
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		System.out.println(session + "ȥ��");
	}

	public void contextDestroyed(ServletContextEvent sce) {

	}

}

class SessionScanTask extends TimerTask {
	private List<HttpSession> sessions;
	private Object lock;

	public SessionScanTask(List<HttpSession> sessions, Object lock) {
		this.sessions = sessions;
		this.lock = lock;
	}

	// ɨ��HttpSession���󣬿�����û�г�ʱ��
	public void run() {
		synchronized (lock) {
			ListIterator<HttpSession> it = sessions.listIterator();
			while (it.hasNext()) {
				HttpSession session = it.next();
				if ((System.currentTimeMillis() - session.getLastAccessedTime()) > 1 * 60 * 1000) {
					session.invalidate();
					it.remove();
				}
			}
		}
	}

}

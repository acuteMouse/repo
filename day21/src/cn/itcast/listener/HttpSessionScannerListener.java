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

//自定义HttpSession扫描器，如果一个HttpSession对象超过1分钟没有用了，主动干掉。
//基础：集合在遍历时，不允许增删其中的元素的。否则会java.util.ConcurrentModificationException
//												 java.util.ConcurrentModificationException

public class HttpSessionScannerListener implements HttpSessionListener,
		ServletContextListener {
	private List<HttpSession> sessions = new ArrayList<HttpSession>();// 存放所有的HttpSession对象
	private Object lock = new Object();

	// 启动定时器
	public void contextInitialized(ServletContextEvent sce) {
		Timer t = new Timer();// 每隔一分钟扫描一次
		t.schedule(new SessionScanTask(sessions,lock), 0, 1 * 60 * 1000);// 启动扫描任务
	}

	// 拿到一个个会话对象
	public void sessionCreated(HttpSessionEvent se) {
		synchronized (lock) {
			HttpSession session = se.getSession();
			System.out.println(session + "来了");
			sessions.add(session);
		}
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		System.out.println(session + "去了");
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

	// 扫描HttpSession对象，看看有没有超时的
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

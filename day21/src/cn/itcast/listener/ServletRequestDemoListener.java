package cn.itcast.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
//��ʲô�ã�
//ͳ��ÿ����Դ�ķ��ʴ���
public class ServletRequestDemoListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println(sre.getServletRequest()+"������");
	}

	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println(sre.getServletRequest()+"������");	
	}

}

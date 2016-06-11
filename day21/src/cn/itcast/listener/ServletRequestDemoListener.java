package cn.itcast.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
//有什么用？
//统计每个资源的访问次数
public class ServletRequestDemoListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println(sre.getServletRequest()+"销毁了");
	}

	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println(sre.getServletRequest()+"创建了");	
	}

}

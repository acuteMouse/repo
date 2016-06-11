package cn.itcast.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
//踢人案例
public class HttpSessionAttributeListenerDemo implements
		HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println(se.getSession()+"放了新东东");
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println(se.getSession()+"删除了东东");
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println(se.getSession()+"东东替换成了西西");
	}

}

package cn.itcast.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
//���˰���
public class HttpSessionAttributeListenerDemo implements
		HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println(se.getSession()+"�����¶���");
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println(se.getSession()+"ɾ���˶���");
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println(se.getSession()+"�����滻��������");
	}

}

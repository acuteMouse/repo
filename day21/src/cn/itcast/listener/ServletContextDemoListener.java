package cn.itcast.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
//�൱���ã�
//public void contextInitialized(ServletContextEvent sce):�˷����еĴ�������Ӧ�ñ�����ʱִ�еģ�ִ��һ�Ρ�
//��ˣ����԰�ϵͳ��һЩ��ʼ����������д�ڴ˴���Ӧ�ó���

public class ServletContextDemoListener implements ServletContextListener {
	//��ServletContext��������ʱִ��
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext��������");
	}
	//��ServletContext���󱻴���ʱִ��
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext��������");
		init();
	}
	/**
	 <beans>
		<bean name="uDao" class="cn.itcast.dao.impl.UserDao"/>
		<bean name="rDao" class="cn.itcast.dao.impl.RoleDao"/>
		<bean name="mDao" class="cn.itcast.dao.impl.MenuDao"/>
		<bean name="..Dao" class="cn.itcast.dao.impl...Dao"/>
	</beans>
	 */
	public void init(){//Spring�ĳ�ʼ��ԭ��
		
		//Map<String,Object>:key:������������value��������
		//XML�ж�ȡ���е�beanԪ��
		//������ȡ��beanԪ�ص�name��classֵ
		//���÷��䣺Object obj = Class.forName(classValue).newInstance();
		//map.put(name,obj);
	}
}

package cn.itcast.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
//相当有用：
//public void contextInitialized(ServletContextEvent sce):此方法中的代码是在应用被加载时执行的，执行一次。
//因此，可以把系统的一些初始化工作代码写在此处。应用场景

public class ServletContextDemoListener implements ServletContextListener {
	//当ServletContext对象被销毁时执行
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext被销毁了");
	}
	//当ServletContext对象被创建时执行
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext被创建了");
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
	public void init(){//Spring的初始化原理
		
		//Map<String,Object>:key:对象引用名，value：对象本身
		//XML中读取所有的bean元素
		//遍历：取到bean元素的name和class值
		//利用反射：Object obj = Class.forName(classValue).newInstance();
		//map.put(name,obj);
	}
}

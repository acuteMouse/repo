package com.hibernate01.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeacherTest {
	private static SessionFactory sessionFactory = null;

	@BeforeClass
	public static void beforeClass() {
		sessionFactory = new AnnotationConfiguration().configure()
				.buildSessionFactory();
	}

	@Test
	public void testTeacherSave() {
		Teacher teacher = new Teacher();
		Teacher teacher2 = new Teacher();
		teacher2.setName("王五");
		teacher2.setBirthday(new Date());
		teacher2.setTitle("初级");
		teacher.setName("赵四");
		teacher.setTitle("教授");
		teacher.setBirthday(new Date());
		// opensession 必须关闭session 每次都是新的session
		// getcurrentsession不用手动关闭了。只要没提交s
		// ession 无论哪多少个都是同一个sessi
		// 用途 ：加载日志是用getcurrentseesion
		// 两次操作同时完成。
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(teacher);
		session.save(teacher2);
		session.getTransaction().commit();
		session.close();
		Session session2 = sessionFactory.getCurrentSession();
		session2.beginTransaction();
		session2.delete(teacher);
		session2.getTransaction().commit();

	}

	@Test
	public void testLoad() {
		/*
		 * load()是把对象变为持久化对象 内存 数据库中都 
		 * 用的时候应该是使用内存中的数据，没有产生sql语句去数据库里查询
		 */

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Teacher teacher = (Teacher) session.load(Teacher.class, 2);
		session.getTransaction().commit();
		System.out.println(teacher.getId());
		System.out.println(teacher.getClass()); //产生的是代理对象

	}

	@Test
	public void testGet() {
		/* get()是立刻用sql语句去数据库里查 */

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Teacher teacher = (Teacher) session.get(Teacher.class, 2);
		session.getTransaction().commit();
		System.out.println(teacher.getName());
		System.out.println(teacher.getClass());// 

	}

	@AfterClass
	public static void AfterClass() {
		sessionFactory.close();

	}
}

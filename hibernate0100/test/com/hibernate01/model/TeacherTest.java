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
		teacher2.setName("����");
		teacher2.setBirthday(new Date());
		teacher2.setTitle("����");
		teacher.setName("����");
		teacher.setTitle("����");
		teacher.setBirthday(new Date());
		// opensession ����ر�session ÿ�ζ����µ�session
		// getcurrentsession�����ֶ��ر��ˡ�ֻҪû�ύs
		// ession �����Ķ��ٸ�����ͬһ��sessi
		// ��; ��������־����getcurrentseesion
		// ���β���ͬʱ��ɡ�
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
		 * load()�ǰѶ����Ϊ�־û����� �ڴ� ���ݿ��ж� 
		 * �õ�ʱ��Ӧ����ʹ���ڴ��е����ݣ�û�в���sql���ȥ���ݿ����ѯ
		 */

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Teacher teacher = (Teacher) session.load(Teacher.class, 2);
		session.getTransaction().commit();
		System.out.println(teacher.getId());
		System.out.println(teacher.getClass()); //�������Ǵ������

	}

	@Test
	public void testGet() {
		/* get()��������sql���ȥ���ݿ���� */

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

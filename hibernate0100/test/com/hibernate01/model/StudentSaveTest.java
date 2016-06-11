package com.hibernate01.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class StudentSaveTest {
	private static SessionFactory sessionFactory = null;

	@BeforeClass
		public static void beforeClass() {
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		}
	@Test
	public void testStudentSave(){
		 Student student=new Student();
		 student.setAge(50);
		 student.setName("ÕÅÈý");
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	
	}
	@AfterClass
	public static void AfterClass(){
		
		sessionFactory.close();
	}
	
	
}

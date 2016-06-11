package com.hibernate01.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.junit.Test;

public class OneToOneTest {
/*	private static SessionFactory sessionFactory = null;

	@BeforeClass
	public static void beforeClass() {
		sessionFactory = new AnnotationConfiguration().configure()
				.buildSessionFactory();
	}
*/
//	@Test
//	public void testSchemaExport() {
//		Session session= new AnnotationConfiguration().configure().buildSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		Query query=session.createQuery("FROM Husband ");
//		List<Husband > hs=query.list();
//		for (Husband husband : hs) {
//			System.out.println(husband.getName());
//			List<Wife> wifes=husband.getWife();
//			for (Wife wife : wifes) {
//				System.out.println(wife.getName());
//			}
//		}
//	}
	@Test
	public void deleteHusband(){
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query =session.createQuery(" select h from Husband h where h.id=1");
		Husband h=(Husband) query.uniqueResult();
		session.delete(h);
		session.getTransaction().commit();
		System.out.println(h.getName());
		
	}
/*
	@AfterClass
	public static void AfterClass() {
		sessionFactory.close();

	}
	*/
}

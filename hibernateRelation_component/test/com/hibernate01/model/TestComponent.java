package com.hibernate01.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestComponent {
	private static SessionFactory sessionFactory = null;

	@BeforeClass
	public static void beforeClass() {
		sessionFactory = new AnnotationConfiguration().configure()
				.buildSessionFactory();
	}

	@Test
	 	public  void testSchemaExpot(){
	 	new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);
	 	
	 		
	 	}

	@AfterClass
	public static void AfterClass() {

		sessionFactory.close();
	}

}

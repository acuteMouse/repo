package com.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatiesUtils {
		private static SqlSessionFactory sqlSeesionFactory;
		public  static SqlSessionFactory getSqlSessionFactory() throws IOException{
			if (sqlSeesionFactory==null) {
				InputStream input=null;
				input=Resources.getResourceAsStream("mybatis-config.xml");
				sqlSeesionFactory=new SqlSessionFactoryBuilder().build(input);
			}
			return sqlSeesionFactory;
			
			
		}
		public static SqlSession opSession() throws IOException{
			return getSqlSessionFactory().openSession();
		}
}

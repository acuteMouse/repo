package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public  class JDBCUtil {
	public static Connection conn;
	//数据库连接
	public static Connection getconConnection() throws Exception {

		String url = "jdbc:mysql://localhost:3306/library";
		String name = "root";
		String password = "root";
		Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
		conn = DriverManager.getConnection(url, name, password);
		return conn;
	}
	public	static  void close(ResultSet rs,Connection conn,PreparedStatement ps) throws SQLException{
		if (!ps.isClosed()&&!(ps==null)) {
			ps.close();
		}
		
		if (!conn.isClosed()&&!(conn==null)) {
			conn.close();
		}
		
	}
}

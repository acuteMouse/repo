package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	static Connection conn = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	/*
	 * 获取jdbc连接
	 */
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/jquery";
		String name = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("为找到mysql驱动");
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, name, password);
		} catch (SQLException e) {
			System.out.println("连接失败");
			e.printStackTrace();
		}
		return conn;

	}
	/*
	 * 释放连接资源
	 */
	public void close() throws Exception {
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}
		if (conn != null) {
			conn.close();
		}

	}
}

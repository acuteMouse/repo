package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.JDBCUtil;


public class FileTest {
	static Connection conn=null;
	static PreparedStatement ps=null;
	public static void main(String[] args) throws SQLException {
			try {
				conn=JDBCUtil.getconConnection();
			} catch (Exception e) {
				System.out.println("连接失败");
				e.printStackTrace();
			}
			ps=conn.prepareStatement("insert into file file values (?)");
	}
}

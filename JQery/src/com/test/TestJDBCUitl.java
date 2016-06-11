package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.util.JDBCUtil;

public class TestJDBCUitl {

	@Test
	public void testGetConnection() throws SQLException {
		Connection conn=JDBCUtil.getConnection();
		String sql="select * from user";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("userName"));
		}
	}

}

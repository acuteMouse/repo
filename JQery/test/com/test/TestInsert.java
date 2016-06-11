package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.util.JDBCUtil;

public class TestInsert {
	@Test
	public void testAdd() throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		String sql = "insert into table1 (name) values(?)";
		for (int i =1000000; i < 1300000; i++) { 
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "小" + i);
			ps.executeUpdate();
			ps.close();
		}
		System.out.println("end");
	}
	@Test
	public void testDelete() throws SQLException{
		Connection conn = JDBCUtil.getConnection();
		String sql = "delete from table1 where id=?";
			for (int i = 0; i <1000001; i++) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, i);
			ps.executeUpdate();
			ps.close();
		}
		System.out.println("end");
		
	}
	@Test
	public void testSelect() throws SQLException{
		Connection conn = JDBCUtil.getConnection();
		String sql = "select name,id from table1 ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				String name=rs.getString("name");
				int id=rs.getInt("id");
//				System.out.println(name);//太他妈的影响性能了，用这个9-10s,不用2.8s左右
			}
		}
		
	}


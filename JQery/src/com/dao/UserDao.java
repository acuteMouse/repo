package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;
import com.util.JDBCUtil;

public class UserDao {
		public User findUser() throws SQLException{
			Connection conn=JDBCUtil.getConnection();
			String sql="select * from user";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			User u=new User();
			while (rs.next()) {
				u.setId(rs.getInt("age"));
				u.setAge(rs.getInt("id"));
				u.setUserName(rs.getString("userName"));
			}
			return u;
		}

		public boolean checkName(String name) throws SQLException {
			Connection conn=JDBCUtil.getConnection();
			String sql="select userName from user where userName=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			boolean isExit=false;
			while (rs.next()) {
				String userNname=rs.getString("userName");
				System.out.println("----"+userNname);
				 isExit=true;
			}
			return isExit;
		}
}

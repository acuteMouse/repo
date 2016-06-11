package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.library.util.JDBCUtil;

public class AdminDao {

	public boolean login(String name, String password) throws Exception {
		String getName = null;
		String getPassword = null;
		Connection conn=JDBCUtil.getconConnection();
		String sql="select name,password from admin where name=? and password=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			 getName=rs.getString("name");
			 getPassword=rs.getString("password");
		}
		if (name.equals(getName)&&password.equals(getPassword)) {
			return true;
			
		}	else{
			return false;
		}
		
	}

	
}

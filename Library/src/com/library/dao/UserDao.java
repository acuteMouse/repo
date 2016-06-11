package com.library.dao;
/**
 * 用户数据访问层
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.model.User;
import com.library.util.JDBCUtil;

public class UserDao {
		/*
		 * 查出所有用户
		 */
	public List<User> findAllUser() throws Exception {
		List<User> ul = new ArrayList<User>();

		Connection conn = JDBCUtil.getconConnection();	//获得数据库连接
		String sql = "select * from user ";				//拼写sql命令
		PreparedStatement ps = conn.prepareStatement(sql);	//预编译sql命令
		ResultSet rs = ps.executeQuery();				
		while (rs.next()) {	
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setUserName(rs.getString("userName"));
			u.setPhone(rs.getInt("phone"));
			u.setNumber(rs.getInt("number"));
			u.setAddress(rs.getString("address"));
			
			ul.add(u);
		}	
		JDBCUtil.close(rs, conn, ps);	//关闭连接，释放资源
		return ul;
	
	}
	/*
	 * 添加用户
	 */
	public void addUser(User u) throws Exception {
		Connection conn=JDBCUtil.getconConnection();	
		String sql="insert into user (userName,phone,number,address)values(?,?,?,?) ";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, u.getUserName());
		ps.setInt(2, u.getPhone());
		ps.setInt(3, u.getNumber());
		ps.setString(4, u.getAddress());
		ps.executeUpdate();
		JDBCUtil.close(null, conn, ps);	//关闭连接，释放资源
		
	}
	/*
	 * 更新用户信息 
	 */
	public void updateUser(User u) throws Exception {
		Connection conn=JDBCUtil.getconConnection();
		String sql="update user set userName=?,phone=?,address=?,number=? where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, u.getUserName());
		ps.setInt(2, u.getPhone());
		ps.setString(3, u.getAddress());
		ps.setInt(4, u.getNumber());
		ps.setInt(5, u.getId());
		ps.executeUpdate();
		JDBCUtil.close(null, conn, ps);	//关闭连接，释放资源
		
	}
	/*
	 * 删除用户
	 */
	public void deleteUser(int id) throws Exception {
		Connection conn=JDBCUtil.getconConnection();
		String sql="delete from user where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
		JDBCUtil.close(null, conn, ps);	//关闭连接，释放资源
	}

}

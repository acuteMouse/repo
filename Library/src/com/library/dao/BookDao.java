package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.util.JDBCUtil;

//数据访问层，使用jdbc
public class BookDao {

	
	
	
	//删除一本书
	public void deleteBook(int id) throws Exception {
		Connection conn=JDBCUtil.getconConnection();
		String sql="delete from book where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);	//预编译sql 命令
		ps.setInt(1, id);//参数赋值
		ps.executeUpdate();
		JDBCUtil.close(null, conn, ps);	//释放连接
	}
	//添加图书信息
	public void addBook(Book b) throws Exception {
		Connection conn=JDBCUtil.getconConnection();
		String sql="insert into book (name,author,publish_company,no,count)values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, b.getName());
		ps.setString(2, b.getAuthor());
		ps.setString(3, b.getPublish_company());
		ps.setInt(4, b.getNo());
		ps.setInt(5, b.getCount());
		ps.executeUpdate();
		JDBCUtil.close(null, conn, ps);	//释放连接
		
	}
	/*
	 * 修改图书信息
	 */
	public void updateBook(Book b) throws Exception {
		Connection conn=JDBCUtil.getconConnection();
		String sql="update book set name=?,author=?,publish_company=?,no=?,count=? where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, b.getName());
		ps.setString(2, b.getAuthor());
		ps.setString(3, b.getPublish_company());
		ps.setInt(4, b.getNo());
		ps.setInt(5, b.getCount());
		ps.setInt(6, b.getId());
		ps.executeUpdate();
		JDBCUtil.close(null, conn, ps);	//释放连接
	}
	/*
	 * 查找所有图书信息
	 */
	public List findAllBook() throws Exception {
		List<Book> bl = new ArrayList<Book>();

		Connection conn = JDBCUtil.getconConnection();
		String sql = "select * from book ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Book b = new Book();
			b.setId(rs.getInt("id"));
			b.setName(rs.getString("name"));
			b.setAuthor(rs.getString("author"));
			b.setNo(rs.getInt("no"));
			b.setPublish_company(rs.getString("publish_company"));
			b.setCount(rs.getInt("count"));
			bl.add(b);
		}
		JDBCUtil.close(rs, conn, ps);	//释放连接
		return bl;
	}

}

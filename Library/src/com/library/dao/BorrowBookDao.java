package com.library.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.model.BorrowBook;
import com.library.util.JDBCUtil;

public class BorrowBookDao {

	public List<BorrowBook> findAll() throws Exception {
		List<BorrowBook> bl = new ArrayList<BorrowBook>();

		Connection conn = JDBCUtil.getconConnection();
		String sql = "select * from borrowBook ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			BorrowBook b = new BorrowBook();
			b.setId(rs.getInt("id"));
			b.setUserName(rs.getString("username"));
			b.setBookName(rs.getString("bookname"));
			b.setBorrowDate(rs.getDate("borrowDate"));
			b.setReturnDate(rs.getDate("returnDate"));
			bl.add(b);
		}
		
		return bl;
	
	}

	public void addBorrow(BorrowBook bb) throws Exception {
		Connection conn=JDBCUtil.getconConnection();
		String sql="insert into borrowbook (userName,bookName,borrowDate,returnDate)values(?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, bb.getUserName());
		ps.setString(2, bb.getBookName());
		ps.setDate(3,  bb.getBorrowDate());
		ps.setDate(4, bb.getReturnDate());
		ps.executeUpdate();
		ps.close();
		conn.close();
		
		
	}

}

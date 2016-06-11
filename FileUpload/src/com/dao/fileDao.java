package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Pic;
import com.util.JDBCUtil;

public class fileDao {
	static Connection conn;
	static PreparedStatement ps;
	public void upFile(Pic p) throws Exception{
		conn=JDBCUtil.getconConnection();
		ps=conn.prepareStatement("insert into file (file) values (?)");
		ps.setBlob(1, p.getFile());
		
	int i=	ps.executeUpdate();
	if (i==0) {
		System.out.println("上传失败");
	}
	System.out.println("上传成功");
	}
}

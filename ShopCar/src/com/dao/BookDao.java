package com.dao;

import java.util.Map;

import com.model.Book;

/**
 * 
 * @author Administrator
 *
 */
public interface BookDao {
	//查找所有的书
	public Map<Integer, Book> finaAllBook();
	//根据id 查找书
	public Book finaById(int  id);
	
}

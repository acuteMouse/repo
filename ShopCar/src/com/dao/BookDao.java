package com.dao;

import java.util.Map;

import com.model.Book;

/**
 * 
 * @author Administrator
 *
 */
public interface BookDao {
	//�������е���
	public Map<Integer, Book> finaAllBook();
	//����id ������
	public Book finaById(int  id);
	
}

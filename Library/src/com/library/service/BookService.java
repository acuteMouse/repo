package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.model.Book;

//业务逻辑层
public class BookService {
	private BookDao bd=new BookDao();//注入Dao 对象

	
	/*
	 * 删除图书
	 */
	public void deleteBook(int id) throws Exception {
		bd.deleteBook(id);
		
	}
	/*
	 * 添加图书
	 */
	public void addBook(Book b) throws Exception {
		bd.addBook(b);
		
	}
	/*
	 * 更新图书信息
	 */
	public void updateBook(Book b) throws Exception {
		bd.updateBook(b);
	
	}
	/*
	 * 查找所有图书
	 */
	public List findAllBook() throws Exception {
		List l=bd.findAllBook();
		return l;
	}

}

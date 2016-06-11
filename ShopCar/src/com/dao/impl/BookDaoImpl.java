package com.dao.impl;

import java.util.Map;

import com.dao.BookDao;
import com.db.Books;
import com.model.Book;

public class BookDaoImpl implements BookDao {


	public Book finaById(int id) {
		return Books.findById(id);
	}

	public Map<Integer, Book> finaAllBook() {
		
		return Books.findAllBook();
	}

}

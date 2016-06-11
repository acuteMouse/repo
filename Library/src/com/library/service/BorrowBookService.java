package com.library.service;

import java.util.List;

import com.library.dao.BorrowBookDao;
import com.library.model.BorrowBook;

public class BorrowBookService {
	private BorrowBookDao bbd = new BorrowBookDao();

	public List<BorrowBook> findAll() throws Exception {
		List<BorrowBook> bbl = bbd.findAll();
		return bbl;
	}

	public void addBorrow(BorrowBook bb) throws Exception {
		bbd.addBorrow(bb);
		
	}

}

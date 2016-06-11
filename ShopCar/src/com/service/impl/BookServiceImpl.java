package com.service.impl;

import java.util.Map;

import com.dao.BookDao;
import com.dao.impl.BookDaoImpl;
import com.model.Book;
import com.model.ShopCar;
import com.model.ShopCarItem;
import com.service.BookService;

public class BookServiceImpl implements BookService {
		private BookDao dao=new BookDaoImpl();
	public Map<Integer, Book> findAllbook() {
	
		return dao.finaAllBook();
	}

	public Book findById(int id) {
		return dao.finaById(id);
	}
	public void addBookToShopCar(ShopCar shopcar,Book book){
		shopcar.addBookToCar(book);
	}

	public void changNumber(ShopCar sc, int bookid, int number) {
		ShopCarItem  shopCarItem=	sc.getItems().get(bookid);
		shopCarItem.setNumber(number);
	}

	public void deleteShopCarItem(ShopCar sc, int id) {
			sc.getItems().remove(id);
	}

}

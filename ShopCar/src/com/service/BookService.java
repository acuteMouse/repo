package com.service;

import java.util.Map;

import com.model.Book;
import com.model.ShopCar;

public interface BookService {
		public Map<Integer, Book> findAllbook();
		public Book findById(int id);
		public void addBookToShopCar(ShopCar shopcar,Book book);
		public void changNumber(ShopCar sc, int bookid, int number);
		public void deleteShopCarItem(ShopCar sc, int id);
}

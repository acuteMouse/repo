package com.model;

/**
 * 购物车里显示的内容
 * 
 * @author Administrator
 * 
 */
public class ShopCarItem {
	private Book book;
	private int number;
	private int price;

	public ShopCarItem(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public float getPrice() {
		return number * book.getPrice();

	}
}

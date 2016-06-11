package com.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//购物车
public class ShopCar {
	private Map<Integer, ShopCarItem> items = new LinkedHashMap<Integer, ShopCarItem>();
	private int num;
	private float price;

	public Map<Integer, ShopCarItem> getItems() {
		return items;
	}

	public void setItems(Map<Integer, ShopCarItem> items) {
		this.items = items;
	}

	public int getNum() {
			num=0;
		for (Entry<Integer, ShopCarItem> me : items.entrySet()) {
			num += me.getValue().getNumber();
		}
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getPrice() {
		price=0;
		for (Entry<Integer, ShopCarItem> me : items.entrySet()) {
			price += me.getValue().getPrice();
		}
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	// 添加书籍到购物车
	public void addBookToCar(Book book) {
		// 买过书就只是把书的数量+1
		if (items.containsKey(book.getId())) {
			ShopCarItem sci = items.get(book.getId());
			sci.setNumber(sci.getNumber() + 1);
		} else {// 没买过就新建一个书的实例添加到购物车中
		ShopCarItem sci=new ShopCarItem(book);
			sci.setNumber(1);
			items.put(book.getId(), sci);
	}
}
}
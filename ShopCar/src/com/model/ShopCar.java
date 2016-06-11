package com.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//���ﳵ
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

	// ����鼮�����ﳵ
	public void addBookToCar(Book book) {
		// ������ֻ�ǰ��������+1
		if (items.containsKey(book.getId())) {
			ShopCarItem sci = items.get(book.getId());
			sci.setNumber(sci.getNumber() + 1);
		} else {// û������½�һ�����ʵ����ӵ����ﳵ��
		ShopCarItem sci=new ShopCarItem(book);
			sci.setNumber(1);
			items.put(book.getId(), sci);
	}
}
}
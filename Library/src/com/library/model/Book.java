package com.library.model;

//书类，对应数据库book表。
public class Book {
	private int id; // 主键
	private String name; // 书名
	private String author; // 作者
	private String publish_company; // 出版社
	private int count; // 库存数量
	private int no; // 编号。唯一

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish_company() {
		return publish_company;
	}

	public void setPublish_company(String publishCompany) {
		publish_company = publishCompany;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}

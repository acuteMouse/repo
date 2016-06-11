package com.library.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.library.model.Book;
import com.library.service.BookService;
import com.opensymphony.xwork2.Action;

/**
 * 
 * 控制层
 * @author Administrator
 * 
 */
public class BookAction {
	private static BookService bs = new BookService();

	private Map responseJson; // 用于返回datagrid需要返回的json数据
	private String ids; // 用于批量删除
	private int id;
	
	private String name;
	private String author;
	private String publish_company;
	private int count;
	private int no;
	
	
	public Map getResponseJson() {
		return responseJson;
	}

	public void setResponseJson(Map responseJson) {
		this.responseJson = responseJson;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

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

	

	public static BookService getBs() {
		return bs;
	}

	public static void setBs(BookService bs) {
		BookAction.bs = bs;
	}

	
	@SuppressWarnings("unchecked")
	public String findAllBook() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		List<Book> books =bs.findAllBook();
		int total = books.size();
		for (int i = 0; i < books.size(); i++) {
			Book b =  books.get(i);
			JSONObject jo = new JSONObject();
			jo.put("id",b.getId());
			jo.put("name", b.getName());
			jo.put("author",b.getAuthor() );
			jo.put("no",b.getNo() );
			jo.put("count",b.getCount() );
			jo.put("publish_company",b.getPublish_company() );
			list.add(jo);
		}
		map.put("rows", list);
		map.put("total", total);
		this.setResponseJson(map);
		
		return Action.SUCCESS;
	}
	/*
	 * 删除图书
	 */
	public String deleteBook() throws Exception {
		String[] Stringid = ids.split(","); // 分隔前台传来的字符串

		for (int i = 0; i < Stringid.length; i++) {
			Book b = new Book();
			int id = Integer.parseInt(Stringid[i]);
		
			
			bs.deleteBook(id);
		}
		return Action.SUCCESS;
	}
	/*
	 * 添加图书
	 */
	public String addBook() throws Exception{
		Book b=new Book();
		b.setAuthor(author);
		b.setCount(count);
		b.setName(name);
		b.setNo(no);
		b.setPublish_company(publish_company);
		bs.addBook(b);
		return Action.SUCCESS;
	}
	/**
	 * 更新图书信息
	 * @throws Exception 
	 */
	public String updateBook() throws Exception{
		Book b=new Book();
		b.setId(id);
		b.setAuthor(author);
		b.setCount(count);
		b.setName(name);
		b.setNo(no);
		b.setPublish_company(publish_company);
		bs.updateBook(b);
		return Action.SUCCESS;
	}
}

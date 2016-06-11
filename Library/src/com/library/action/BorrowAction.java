package com.library.action;

import java.sql.Date;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.library.model.BorrowBook;
import com.library.service.BorrowBookService;
import com.opensymphony.xwork2.Action;

public class BorrowAction {
	private int id;
	private String userName; // 借书人
	private String bookName; // 借的书名
	private Date borrowDate; // 借书如期
	private Date returnDate;
	private Map responseJson; // 用于返回datagrid需要返回的json数据
	private String ids;
	private BorrowBookService bbs = new BorrowBookService();

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Map getResponseJson() {
		return responseJson;
	}

	public void setResponseJson(Map responseJson) {
		this.responseJson = responseJson;
	}

	public BorrowBookService getBbs() {
		return bbs;
	}

	public void setBbs(BorrowBookService bbs) {
		this.bbs = bbs;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	/*
	 * 查出所有的借阅记录
	 */
	@SuppressWarnings( { "unchecked", "deprecation" })
	public String findAll() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		List<BorrowBook> bb = bbs.findAll();
		int total = bb.size();
		for (int i = 0; i < bb.size(); i++) {
			BorrowBook b = bb.get(i);
			JSONObject jo = new JSONObject();
			jo.put("id", b.getId());
			jo.put("userName", b.getUserName());
			jo.put("bookName", b.getBookName());
			jo.put("borrowDate", b.getBorrowDate().toLocaleString());
			jo.put("returnDate", b.getReturnDate().toLocaleString());
			list.add(jo);
		}
		map.put("rows", list);
		map.put("total", total);
		this.setResponseJson(map);

		return Action.SUCCESS;
	}

	/*
	 * 添加借阅记录
	 */
	public String addBorrow() throws Exception {
		BorrowBook bb = new BorrowBook();
		bb.setBookName(bookName);
		bb.setBorrowDate(borrowDate);
		bb.setReturnDate(returnDate);
		bb.setUserName(userName);
		bbs.addBorrow(bb);
		return Action.SUCCESS;
	}
}

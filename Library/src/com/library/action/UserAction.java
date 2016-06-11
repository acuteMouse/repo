package com.library.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.library.model.Book;
import com.library.model.User;
import com.library.service.UserService;
import com.opensymphony.xwork2.Action;

public class UserAction {
	private int id; // 主键 唯一
	private String userName; // 用户名
	private int number; // 编号，唯一
	private int phone; // 联系方式
	private String address;// 联系地址
	private Map responseJson; // 用于返回datagrid需要返回的json数据
	private String ids; // 用于批量删除
	private UserService us = new UserService();

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 查询所有用户
	 * 
	 * @return
	 * @throws Exception
	 */
	public String findAllUser() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		List<User> users = us.finfAllUser();
		int total = users.size();
		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			JSONObject jo = new JSONObject();
			jo.put("id", u.getId());
			jo.put("userName", u.getUserName());
			jo.put("phone", u.getPhone());
			jo.put("number", u.getNumber());
			jo.put("address", u.getAddress());
			list.add(jo);
		}
		map.put("rows", list);
		map.put("total", total);
		this.setResponseJson(map);

		return Action.SUCCESS;
	}
	/**
	 * 添加用户
	 * @return
	 * @throws Exception
	 */
	public String addUser() throws Exception {
		User u = new User();
		u.setAddress(address);
		u.setNumber(number);
		System.out.println(phone);
		u.setPhone(phone);
		u.setUserName(userName);
		us.addUser(u);
		return Action.SUCCESS;
	}
	/*
	 * 修改用户信息
	 */
	public String updateUser() throws Exception{
		User u = new User();
		u.setAddress(address);
		u.setNumber(number);
		u.setPhone(phone);
		u.setUserName(userName);
		u.setId(id);
		us.updateUser(u);
		return Action.SUCCESS;
	}
	public String deleteUser() throws Exception{
		String[] Stringid = ids.split(","); // 分隔前台传来的字符串

		for (int i = 0; i < Stringid.length; i++) {
			User u=new User();
			int id = Integer.parseInt(Stringid[i]);
		
			
			us.deleteBook(id);
		}
		return Action.SUCCESS;
		
	}
}
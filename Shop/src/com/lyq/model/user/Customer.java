package com.lyq.model.user;

import java.io.Serializable;
/**
 * 普通用户
 * 
 */
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;//      存储用户唯一标识
	private String username;// 用户名
	private String password;//  密码
	private String realname;//  真实姓名
	private String email;//   注册邮箱
	private String address;//  用户地址
	private String mobile;//  	联系电话
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}

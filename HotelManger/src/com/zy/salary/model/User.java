package com.zy.salary.model;

import java.math.BigInteger;
import java.sql.Date;

/**
 * 用户类，对应数据库表:User
 * 
 * @author 陈桂林
 * 
 */
public class User {
	private int id; // 表主键
	private String realName; // 真实姓名
	private String userName;// 登陆帐号
	private String password;// 登陆口令
	private BigInteger phone;// 联系电话
	private int idCard; // 身份证号
	private String address;// 居住地址
	private Job job; // 职位,外键，和Job表关联
	private Salary salary;// 薪水,外键，和salary表关联
	private String sex;// 性别
	private Date birthday;// 出生日期
	private boolean isEverPresent = true;// 是否全勤,默认全勤
	private int liZhi ;//是否离职，0，代表离职，1，代表未离职
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public int getIdCard() {
		return idCard;
	}

	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isEverPresent() {
		return isEverPresent;
	}

	public void setEverPresent(boolean isEverPresent) {
		this.isEverPresent = isEverPresent;
	}

	public int getLiZhi() {
		return liZhi;
	}

	public void setLiZhi(int liZhi) {
		this.liZhi = liZhi;
	}
	
}

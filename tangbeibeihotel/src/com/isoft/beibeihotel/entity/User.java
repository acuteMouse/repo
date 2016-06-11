package com.isoft.beibeihotel.entity;

public class User {
	private String name;//姓名
	private String sex;//性别
	private String cardid;//身份证号
	private String phone;//电话号码
	private String id;//会员号
	private int isUser;//是否是会员
	
	public User() {
		super();
	}
	
	public User(String name, String sex, String cardid, String phone, String id,int isUser) {
		super();
		this.name = name;
		this.sex = sex;
		this.cardid = cardid;
		this.phone = phone;
		this.id = id;
		this.isUser=isUser;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCardid() {
		return cardid;
	}
	
	public int getIsUser() {
		return isUser;
	}

	public void setIsUser(int isUser) {
		this.isUser = isUser;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return name+"\t\t" +  sex+"\t\t"  + cardid+"\t\t"+ phone +"\t\t"+id+"\t\t"+isUser  ;
	}

	public String toSaveString() {
		return name + "#"+  sex+ "#"+ cardid+ "#"+ phone + "#"+id +'#'+isUser ;
	}
}

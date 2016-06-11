package com.isoft.beibeihotel.entity;

public class Client {
	private String name;//客户名
	private String cardId;//身份证号
	private String sex;//性别
	private String RoomType;//房间类型
	private String roomNumber;//房间号
	private int rent;//租金
	private int day;//天数
	
	public Client(){
		super();
	}
	public Client(String name, String cardId, String sex, String roomType,
			String roomNumber, int rent,int day) {
		super();
		this.name = name;
		this.cardId = cardId;
		this.sex = sex;
		RoomType = roomType;
		this.roomNumber = roomNumber;
		this.rent = rent;
		this.day=day;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return name + "\t\t" + cardId + "\t\t" + sex
				+ "\t\t" + RoomType + "\t\t" + roomNumber
				+ "\t\t" + rent+"\t\t"+day;
	}
	
	public String saveClinet(){
		return name + "---" + cardId + "---" + sex
				+ "---" + RoomType + "---" + roomNumber
				+ "---" + rent+"---"+day;
	}
	
	
}

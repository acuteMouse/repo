package com.isoft.beibeihotel.entity;

public class Room {
	private String roomType; //房间类型
	private  float roomPrince; // 房间价格
	private String roomNumber; //房间号
//	private String joinTime;   //入住时间
	private boolean isJoin;  //判断是否入住
//	private float rentMOney;  //租金
	
	//构造器
	public Room(){
		super();
	}
	public Room(String roomType, float roomPrince, String roomNumber,boolean isJoin) {
		super();
		this.roomType = roomType;
		this.roomPrince = roomPrince;
		this.roomNumber = roomNumber;
//		this.joinTime = joinTime;
		this.isJoin = isJoin;
//		this.rentMOney = rentMOney;
	}
    //设置器和访问器
	public String getRoomType() {
		return roomType;
	}
	public float getRoomPrince() {
		return roomPrince;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	/*public String getJoinTime() {
		return joinTime;
	}*/
	public boolean isJoin() {
		return isJoin;
	}
	/*public float getRentMOney() {
		return rentMOney;
	}*/
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public void setRoomPrince(float roomPrince) {
		this.roomPrince = roomPrince;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	/*public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}*/
	public void setJoin(boolean isJoin) {
		this.isJoin = isJoin;
	}
	/*public void setRentMOney(float rentMOney) {
		this.rentMOney = rentMOney;
	}*/
	
	//字符串输出
	@Override
	public String toString() {
		return  roomType + "\t\t"+ roomPrince+"\t\t"+roomNumber+"\t\t"+ isJoin;
	}
	//把收集的信息返回，保存学生信息
	public String SaveRoom(){
		return roomType + "---"+ roomPrince+"---"+roomNumber+"---"+ isJoin;
	}
	
}

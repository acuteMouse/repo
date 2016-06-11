package com.isoft.beibeihotel.view;

import java.util.Scanner;

import com.isoft.beibeihotel.entity.Client;
import com.isoft.beibeihotel.entity.Room;
import com.isoft.beibeihotel.entity.User;


public class Input {
	//成员变量
	private Scanner in; 
	private Output out;
	//构造方法中进行实例化
	public Input(){
		out=new Output();
	}
	//私有的用于显示提示信息的方法
	private void show(String msg){
		in=new Scanner(System.in);
		System.out.print(msg+":");
	}
	//提供获得int类型的数据方法
	
	public int getIntInfo(String msg){
		//打印提示信息，并处理int、flaot类型的异常
		try{
			in=new Scanner(System.in);
		    this.show(msg);
		   //获得数据并抛出
		    return in.nextInt();
		}catch(Exception e){
			System.out.println("输入错误请重新输入！！");
			return this.getIntInfo(msg);
		}
	}
	//提供float类型数据的方法
	public float getFloatInfo(String msg){
		try{in=new Scanner(System.in);
		this.show(msg);
		return in.nextFloat();
		}catch(Exception e){
			System.out.println("输入错误请重新输入！！");
			return this.getFloatInfo(msg);
		}
	}
	//提供字符串数据的犯法
	public String getStringInfo(String msg){
		in=new Scanner(System.in);
		this.show(msg);
		return in.next();
	}

    public boolean getBooleanInfo(String msg){
    	this.show(msg);
    	return in.nextBoolean();
    }
    public Room getRoom(){
		Room room = new Room();
		room.setRoomType(this.getStringInfo("请输入房间类型"));
		room.setRoomPrince(this.getFloatInfo("请输入房间价格"));
		room.setRoomNumber(this.getStringInfo("请输入房间号"));
//		room.setJoinTime(this.getStringInfo("请输入入住时间"));
		room.setJoin(this.getBooleanInfo("请输入是否入住"));
//        room.setRentMOney(this.getFloatInfo("请输入押金"));
		return room;
	}
    public User getUser(){
    	User user = new User();
    	user.setName(this.getStringInfo("请输入姓名"));
    	user.setSex(this.getStringInfo("请输入性别"));
    	user.setCardid(this.getStringInfo("请输入身份证号"));
    	user.setPhone(this.getStringInfo("请输入电话号码"));
    	user.setId(this.getStringInfo("请输入会员号"));
    	user.setIsUser(this.getIntInfo("输入是否是会员（0或1）"));
    	return user;
    }
    public Client getClient(){
    	Client client = new Client();
    	client.setName(this.getStringInfo("请输入客户姓名"));
    	client.setCardId(this.getStringInfo("请输入客户身份证号"));
    	client.setSex(this.getStringInfo("请输入客户性别"));
    	client.setRoomType(this.getStringInfo("请输入房间类型"));
    	client.setRoomNumber(this.getStringInfo("请输入房间号"));
    	client.setRent(this.getIntInfo("请输入押金"));
    	client.setDay(this.getIntInfo("请输入客户住的天数"));
    	return client;
    }
    public boolean login(){
		String trueName="admin";
		String truePsw="admin";
		for (int i = 2; i>=0; i--) {
			String name=this.getStringInfo("请输入管理员用户名");
			String psw=this.getStringInfo("请输入密码");
			if (!name.equals(trueName)|| !psw.equals(truePsw) ) {
				System.out.print("输入不正确！！");
				System.out.println("你还有"+i+"次机会");
				System.out.println("\n");
				if (i==0) {
					System.out.println("对不起三次均输入错误,退出本系统");
//					return;
					System.exit(-1);
				}
				continue;
			}
			break;
		}
	    return true;
	}
}

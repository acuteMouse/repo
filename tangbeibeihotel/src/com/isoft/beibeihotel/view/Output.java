package com.isoft.beibeihotel.view;

import java.util.Collection;

import com.isoft.beibeihotel.entity.Client;
import com.isoft.beibeihotel.entity.Room;
import com.isoft.beibeihotel.entity.User;

public class Output {
	public final int TITLE=0;
	//定义静态常量，用有含义的变量名来标识选择的数据
	public  final int ZHUCAIDAN=1;
	public  final int ZICAIDAN=2;
	public  final int UGONGNENG=3;
	public  final int UPDATEUSER=4;
	public  final int UPDATEFINISH=5;
	public  final int RGONGNENG=6;
	public  final int ERRORINFO=7;
	public  final int CFUNCTION=8;
	public  final int UPDATEFINISHED=9;
	//根据不同参数打印相对应的菜单
	public void showMenu(int num){
		
		//判断num值，打印对应字符串
		switch(num){
		case 0:
			System.out.println("****************欢迎光临贝贝hotel******************");
			break;
		case 1:
			System.out.println("欢迎使用管理系统");break;
		case 2:
			System.out.println("1.会员信息管理  2.宾馆房间管理   3.办理客户手续   4.退出"); break;
		case 3:
			System.out.println("1.添加会员信息  2.删除会员信息  3.修改会员信息 4.查找会员信息  0.返回上一级"); break;
		case 4:
			System.out.println("1.姓名 2.性别  3.身份证号 4.电话   ");break;
		case 5:
		     System.out.println("修改完成按数字0退出");break;
		case 6:
			System.out.println("1.添加房间信息 2.修改房间信息 3.查询房间信息  0.返回上一级");break;
		case 7:
	    	System.out.println("输入错误，请重新选择");break;
		case 8:
			System.out.println("1.住房   2.退房  3.查询住房记录  0.返回上一级");break;
		case 9:
			System.out.println("1.房间类型  2.房间价格  ");break;
		}
	}
		//显示会员信息
		public void showUser(Collection<User> list){    	 
			System.out.println("姓名\t\t性别\t\t身份证号\t\t电话\t\t会员卡号\t\t是否是会员");
			for(User user:list){
				System.out.println(user.toString());
			}
		}
		public void showUser(User user){    	 
			System.out.println("姓名\t\t性别\t\t身份证号\t\t电话\t\t会员卡号\t\t是否是会员");    	
			System.out.println(user.toString());

		}
		//显示房间信息
		public void showRoom(Collection<Room> list){    	 
			System.out.println("房间类型\t\t房间价格\t\t房间号\t\t是否为空房");
			for(Room room:list){
				System.out.println(room.toString());
			}
		}
		public void showRoom(Room room){    	 
			System.out.println("房间类型\t\t房间价格\t\t房间号\t\t是否为空房");    	
			System.out.println(room.toString());

		}
		//显示客户信息
		public void showClient(Collection<Client> collection){
			System.out.println("姓名\t\t身份证号\t\t性别\t\t房间类型\t\t房间号\t\t押金\t\t住的天数");
			for (Client client : collection) {
				System.out.println(client.toString());
			}
		}
		public void showClient(Client client){    	 
			System.out.println("姓名\t\t身份证号\t\t性别\t\t房间类型\t\t房间号\t\t押金\t\t住的天数");    	
			System.out.println(client.toString());

		}
	
}

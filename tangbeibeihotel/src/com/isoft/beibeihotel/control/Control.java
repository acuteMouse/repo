package com.isoft.beibeihotel.control;

import java.util.Map;

import com.isoft.beibeihotel.biz.ClientBiz;
import com.isoft.beibeihotel.biz.RoomBiz;
import com.isoft.beibeihotel.biz.UserBiz;
import com.isoft.beibeihotel.entity.Client;
import com.isoft.beibeihotel.entity.Room;
import com.isoft.beibeihotel.entity.User;
import com.isoft.beibeihotel.view.Input;
import com.isoft.beibeihotel.view.Output;


public class Control {
	private Map<String, User> map1;
	private Map<String, Room> map2;
	private Map<String, Client> map3;
	private UserBiz userbiz;
	private RoomBiz roombiz;
	private ClientBiz clientBiz;
	private Output out;
	private Input in;
	private ControlUser cuser;
	private RoomControl croom;
	private ClientControl cclient;

	//构造函数
	public Control(){
		
		cuser =new ControlUser();
		croom= new RoomControl();
		cclient =new ClientControl();
		in=new Input();
		out=new Output();
		userbiz=new UserBiz();
		roombiz=new RoomBiz();
		clientBiz=new ClientBiz();
	}
	public void start(){
		if (!in.login()) {
		}else {
			out.showMenu(out.TITLE);
			out.showMenu(out.ZHUCAIDAN);
			while(true){
				//显示主菜单
				out.showMenu(out.ZICAIDAN);
				//根据选择执行功能
				switch(in.getIntInfo("请选择菜单数字")){
				case 1://会员管理
					this.startSubUser();
					break;
				case 2://房间管理
					this.startSubRoom();
					break;
				case 3://办理客户手续
					this.startSubClient();
					break;
				case 4://退出程序
					System.exit(-1);
					
				}
			}
			
		}
	}	
	public void startSubUser(){
		out.showMenu(out.UGONGNENG);
		while(true){
			switch(in.getIntInfo("用户请选择使用的功能")){
			case 1:
				cuser.addUser();
				break;
			case 2:
				cuser.delUser();
				break;
			case 3:
				cuser.updateUser();
				break;
			case 4:
				map1=userbiz.search(); //从biz那里获得人员信息
				out.showUser(map1.values());
				break;
			case 0:
	            return;			
			default:
					out.showMenu(out.ERRORINFO);
					break;
			}
		}
		
	}
	public void startSubRoom(){
		out.showMenu(out.RGONGNENG);
		while(true){
			switch(in.getIntInfo("用户请选择使用的功能")){
			case 1:
				croom.addRoom();
				break;
			case 2:
				croom.updateRoom();
				break;
			case 3:
				map2=roombiz.searchRoom();
				out.showRoom(map2.values());
				break;
			case 0:
	            return;			
			default:
				out.showMenu(out.ERRORINFO);
					break;
				
			}
		}
		
	}
	public void startSubClient(){
		out.showMenu(out.CFUNCTION);
		while(true){
			switch(in.getIntInfo("用户请选择使用的功能")){
			case 1:
				cclient.clientJoinIn();
				break;
			case 2:
				cclient.clientJoinOut();
				break;
			case 3:
				//从biz那里获得人员信息
				map3=clientBiz.searchClient(); 
				out.showClient(map3.values());
				break;
			case 0:
	            return;			
			default:
					out.showMenu(out.ERRORINFO);
					break;
			}
		}
	}

}



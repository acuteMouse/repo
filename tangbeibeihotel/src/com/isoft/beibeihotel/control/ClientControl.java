package com.isoft.beibeihotel.control;

import java.util.Map;

import com.isoft.beibeihotel.biz.ClientBiz;
import com.isoft.beibeihotel.entity.Client;
import com.isoft.beibeihotel.view.Input;
import com.isoft.beibeihotel.view.Output;

public class ClientControl {
	private Map<String, Client> clientMap;
//	private Map<String, Room> roomMap;
	private Input in;
	private Output out;
	private ClientBiz clientBiz;
//	private RoomBiz roomBiz;
	private RoomControl roomControl;
	private ControlUser controlUser;
	
	//构造器，实例化成员变量
	public ClientControl(){
		in = new Input();
		out = new Output();
		clientBiz = new ClientBiz();
		clientMap = clientBiz.searchClient();
//		roomBiz = new RoomBiz();
//		roomMap = roomBiz.searchRoom();
		roomControl = new RoomControl();
		controlUser = new ControlUser();
	}
	//住房
	public void clientJoinIn(){
		//获得客户信息
		Client client = in.getClient();
		//判断客房是否有人
		if (clientMap.containsKey(client.getRoomNumber())  ) {
			System.err.println("此客房已经有人");
		}else{
			//增加住房信息
			clientBiz.clientJoinIn(client);
			//更新map集合数据
			clientMap = clientBiz.searchClient();
			//显示住房信息
			out.showClient(client);
			//更改客房状态
			roomControl.joinInUpdateRoom(client.getRoomNumber());
		}
		
	}
	//退房
	public void clientJoinOut(){
		//输入退房房间号
		String roomNumber=in.getStringInfo("请输入要退房的房间号");
		//判断房间号是否存在
		if(!clientMap.containsKey(roomNumber)){
			System.out.println("房间号不正确");
		}else{
			//通过房间号，实例化客户
			Client client=clientMap.get(roomNumber);
			//显示入住信息
			out.showClient(client);
			//结算，多退少补
			this.account(client.getRoomNumber(),client.getRent(),client.getDay(),client.getCardId());
			//移除住房记录
			clientMap.remove(client.getRoomNumber());
			//将map的数据覆盖txt文件
			clientBiz.clientJoinOut(clientMap);
			//修改房间状态
			roomControl.joinOutUpdateRoom(client.getRoomNumber());
			
		}
	}
	//结算
	public void account(String roomNumber,int rent ,int day,String cardId){
		float roomPrince=roomControl.getRoomPrince(roomNumber);
		float totalConsume=in.getFloatInfo("请输入查房后客户房间消费金额");
		if ( (rent-roomPrince*day-totalConsume)>0  ){
			System.out.println("客户交了"+rent+"元押金");
			//把客户的身份证号作为会员号判断是不是会员
			if (controlUser.getIsUserInfo(cardId)) {
				System.out.println("客户是会员，享受8折优惠！！");
				System.out.println("找回客户的押金为"+(rent-roomPrince*day*0.8-totalConsume) );
			}else{
				System.out.println("客户不是会员");
				System.out.println("找回客户的押金为"+(rent-roomPrince*day-totalConsume) );
				
			}
		}else {
			System.out.println("客户交了"+rent+"元押金");
			if (controlUser.getIsUserInfo(cardId)) {
				System.out.println("客户是会员，享受8折优惠！！");
				System.out.println("客户的应该付"+(-(rent-roomPrince*day*0.8-totalConsume)) );
			}else {
				System.out.println("客户不是会员");
				System.out.println("客户的应该付"+(-(rent-roomPrince*day-totalConsume)) );
			}
		}
	}
}

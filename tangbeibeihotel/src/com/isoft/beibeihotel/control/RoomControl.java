package com.isoft.beibeihotel.control;

import java.util.Map;

import com.isoft.beibeihotel.biz.RoomBiz;
import com.isoft.beibeihotel.entity.Room;
import com.isoft.beibeihotel.view.Input;
import com.isoft.beibeihotel.view.Output;


public class RoomControl {
	private Map<String, Room> map;
	private Input input;
	private Output output;
    private RoomBiz roomBiz;
	
	public RoomControl(){
		input = new Input();
		output = new Output();
		roomBiz = new RoomBiz();
		map = roomBiz.searchRoom();
	}
	//添加房间
	public void addRoom(){
		Room room = input.getRoom();
		if (map.containsKey(room.getRoomNumber())) {
			System.err.println("此房间已经存在！！");
		}else{
			roomBiz.addRoom(room);
			map=roomBiz.searchRoom();
		}
	}
	//修改房间信息
	public void updateRoom(){
		//输入你要修改的房间号
				String roomNumber=input.getStringInfo("请输入房间号");
				//:判断此房间是否存在
				if(!map.containsKey(roomNumber)){
					System.err.println("此房间已经存在！！");
					return;
				}	
				//:显示要修改的信息
				Room room=map.get(roomNumber);
				output.showRoom(room);
				//选择修改的地方
				boolean flag=false;
				end:
					while(true){
						//显示修改菜单
						output.showMenu(output.UPDATEFINISHED);
						output.showMenu(output.UPDATEFINISH);
						switch(input.getIntInfo("输入你要选择修改的选项")){
						case 1:
							room.setRoomType(input.getStringInfo("请输入新的房间类型"));
							flag=true;
							break;
						case 2:
							room.setRoomPrince(input.getFloatInfo("请输入新的房间价格"));
							flag=true;
							break;
						/*case 3:
							room.setRoomNumber(input.getStringInfo("请输入新的房间号"));
							flag=true;
							break;*/
						/*case 3:
							room.setJoinTime(input.getStringInfo("请输入新的入住时间"));
							flag=true;
							break;*/
						/*case 4:
							room.setJoin(input.getBooleanInfo("请输入新的是否入住"));
							flag=true;
							break;*/
						/*case 5:
							room.setRentMOney(input.getFloatInfo("请输入新的入住押金"));
							flag=true;
							break;*/
							//退出
						case 0:break end;	
						}
					}
				//如果修改了，把修改的内容放到map集合中
				if(flag){
					map.put(room.getRoomNumber(), room);
					roomBiz.updateRoomInfo(map);
					
				}

			}
	//选择住房通过房间号自动修改住房状态
	public void joinInUpdateRoom(String roomNumber){
		Room room=map.get(roomNumber);
		room.setJoin(true);
		map.put(room.getRoomNumber(), room);
		roomBiz.updateRoomInfo(map);
	}
	public void joinOutUpdateRoom(String roomNumber){
		Room room=map.get(roomNumber);
//		output.showRoom(room);
		room.setJoin(false);
		map.put(room.getRoomNumber(), room);
		roomBiz.updateRoomInfo(map);
	}
	//通过房间号返回住房状态
	public boolean getJoinInfo(String roomNumber){
		
		Room room=map.get(roomNumber);
		if (null==room) {
			
			return false;
		}
		return room.isJoin();
	}
	//返回flaot类型的房间价格
	public float getRoomPrince(String roomNumber){
		Room room=map.get(roomNumber);
		return room.getRoomPrince();
	}
	
	}

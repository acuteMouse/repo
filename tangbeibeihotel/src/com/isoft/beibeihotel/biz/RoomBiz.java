package com.isoft.beibeihotel.biz;

import java.util.Map;

import com.isoft.beibeihotel.dao.RoomDao;
import com.isoft.beibeihotel.entity.Room;


public class RoomBiz {
	//成员变量
	private RoomDao dao;
	//实例化
	public RoomBiz(){
		dao=new RoomDao();
	}
	//增加房间
	public void addRoom(Room room){
		dao.write(room);
	}
	//修改房间
	public void updateRoomInfo(Map<String , Room> map){
		dao.write(map.values());
	}
	//查询
	public Map<String , Room> searchRoom(){
		 return dao.read();
	}
}






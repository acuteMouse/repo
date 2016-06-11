package com.isoft.beibeihotel.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.isoft.beibeihotel.entity.Room;


public class RoomDao {
	
	private FileReader fr;
	private BufferedReader bfr;
	private FileWriter fw;
	private BufferedWriter bfw;
	private String path;
	
	public RoomDao(){
		this.path="datas/room.txt";
		File file = new File("datas");
		if (!file.exists()) {
			file.mkdir();
		}
	}
	//对具体文件的文件读
	public Map<String, Room> read(){
		Map<String, Room> map = new HashMap<String, Room>();
		try {
			fr = new FileReader(path);
			bfr=new BufferedReader(fr);
			String string=null;
			while ( (string=bfr.readLine() )!=null ) {
				//判断字符串长度要大于1
				if(string.length()<=1){
					continue;
				}
				//拆分字符串
				String []strArr=string.split("---");
				//把数组封装到类中
				Room room = new Room(strArr[0], Float.parseFloat(strArr[1]), 
						strArr[2],Boolean.parseBoolean(strArr[3]));
			    //封装的数据放到Map集合中
				map.put(room.getRoomNumber(), room);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		    //e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (bfr!=null) 
					bfr.close();
				if(fr!=null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return map;
	}
	//对具体文件的写操作
	public void write(Room room){
		try {
			fw = new FileWriter(path,true);
			bfw=new BufferedWriter(fw);
			bfw.write(room.SaveRoom());
			bfw.newLine();
			bfw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bfw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void write(Collection<Room> collection){
		try {
			fw = new FileWriter(path);
			bfw = new BufferedWriter(fw);
			for (Room room : collection) {
				bfw.write(room.SaveRoom());
				bfw.newLine();
				bfw.flush();
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bfw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

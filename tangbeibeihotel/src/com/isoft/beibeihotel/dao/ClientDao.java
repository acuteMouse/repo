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

import com.isoft.beibeihotel.entity.Client;
import com.isoft.beibeihotel.entity.Room;

public class ClientDao {
	private FileWriter fw;
	private BufferedWriter bfw;
	private FileReader fr;
	private BufferedReader bfr;
	private String path;
	
	public ClientDao(){
		this.path="datas/client.txt";
		File file = new File("datas");
		if (!file.exists()) {
			file.mkdir();
		}
	}
	//对具体文件的文件读
		public Map<String, Client> read(){
			Map<String, Client> map = new HashMap<String, Client>();
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
					Client client = new Client(strArr[0],strArr[1],strArr[2],strArr[3],strArr[4],Integer.parseInt(strArr[5]),Integer.parseInt(strArr[6]) );
				    //封装的数据放到Map集合中
					map.put(client.getRoomNumber(), client);
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
		public void write(Client client){
			try {
				fw = new FileWriter(path,true);
				bfw=new BufferedWriter(fw);
				bfw.write(client.saveClinet());
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
		public void write(Collection<Client> collection){
			try {
				fw = new FileWriter(path);
				bfw = new BufferedWriter(fw);
				for (Client client : collection) {
					bfw.write(client.saveClinet());
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

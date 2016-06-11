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

import com.isoft.beibeihotel.entity.User;



public class UserDao {
	private String path;
	private FileReader reader;
	private BufferedReader br;
	private FileWriter  writer;
	private BufferedWriter bw;
	public UserDao(){
		path="datas/users.txt";	
		File file=new File("datas");
		if(!file.exists()){
			file.mkdir();
		}
	}
	//写入
	public void writer(Collection<User> list){
		try {
			writer=new FileWriter(path);//覆盖写入
			bw=new BufferedWriter(writer);
			for(User user:list){
				bw.write(user.toSaveString());
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void writer (User user){
		try {
			writer=new FileWriter(path,true);//追加写入
			bw =new BufferedWriter(writer);
			bw.write(user.toSaveString());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	//读取
	public Map<String,User> reader(){
		Map<String,User> map=new HashMap<String,User>();
		try {
			reader=new FileReader(path);
			br=new BufferedReader(reader);
			String strLine=null;
			while((strLine=br.readLine())!=null){
				if(strLine.length()<1){
					continue;
				}else{
					String []arr=strLine.split("#");
					User user=new  User(arr[0],arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]));
					map.put(user.getId(), user);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){
				br.close();
				}
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return map;
	}
	
}

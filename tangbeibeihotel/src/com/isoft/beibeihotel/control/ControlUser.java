package com.isoft.beibeihotel.control;

import java.util.Map;

import com.isoft.beibeihotel.biz.UserBiz;
import com.isoft.beibeihotel.entity.Room;
import com.isoft.beibeihotel.entity.User;
import com.isoft.beibeihotel.view.Input;
import com.isoft.beibeihotel.view.Output;


public class ControlUser {
	private Input in;
	private Output out;
	private UserBiz userBiz;
	private Map<String,User> map;
	public ControlUser(){
		in=new Input();
		out=new Output();
		userBiz=new UserBiz();
		map=userBiz.search();
	}
	//添加会员
	public User addUser(){
		User user=in.getUser();
		if(map.containsKey(user.getId())){
			System.out.println("你已经是会员");
		}else{
			userBiz.add(user);
			map=userBiz.search();
		}
		return user;
	}
	//删除会员
	public void delUser(){
		String id=in.getStringInfo("请输入要删除会员账号");
		if(!map.containsKey(id)){
			System.out.println("该账号不存在");
		}else{
			User user=map.get(id);
			out.showUser(user);
			if("y".equalsIgnoreCase(in.getStringInfo("是否删除[y|n]"))){
				map.remove(user.getId());
				userBiz.update(map);//将map的数据覆盖txt文件
			}
		}
	}
	//修改会员信息
	public void updateUser(){
		String id=in.getStringInfo("请输入要修改的会员账号");
		if(!map.containsKey(id)){
			System.out.println("该账号不存在");
		}else{
			User user=map.get(id);
			out.showUser(user);
			boolean flag=false;
			end:
				while(true){
					//out.show(play.ZICAIDAN);
					out.showMenu(out.UPDATEUSER);
					out.showMenu(out.UPDATEFINISH);
					switch(in.getIntInfo("请输入你要修改的选项")){
					case 1:
						user.setName(in.getStringInfo("请输入新的名字"));
						flag=true;
						break;
					case 2:
						user.setSex(in.getStringInfo("请输入性别"));
						flag=true;
						break;
					case 3:
						user.setPhone(in.getStringInfo("请输入新的电话号码"));
						flag=true;
						break;
					
					case 0:
						break end;
					}
				}
				if(flag){
					map.put(user.getId(), user);
					userBiz.update(map);
				}
		}
	}
	//通过会员号返回是否是会员
	public boolean getIsUserInfo(String id){
		//通过会员账号得到会员对象
		User user = map.get(id);
		int temp=user.getIsUser();
		//如果isUser为1则是会员，0则不是会员
		if (temp==1) {
			return true;
		}else {
			return false;
		}
	}
}

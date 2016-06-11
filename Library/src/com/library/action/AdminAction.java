package com.library.action;

import com.library.service.AdminService;
import com.opensymphony.xwork2.Action;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class AdminAction {
		private int id;
		private String name;
		private String password;
		private AdminService as =new AdminService();
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String login() throws Exception{
		   boolean isExit= as.login(name,password);
		   if (isExit) {
			   return "success";
		}
		   else{
			   return "error";
		   }
		}
}

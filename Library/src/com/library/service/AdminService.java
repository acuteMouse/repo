package com.library.service;

import com.library.dao.AdminDao;

public class AdminService {
	private AdminDao ad = new AdminDao();

	public boolean login(String name, String password) throws Exception {
		
		return ad.login(name,password);
	}

	
}

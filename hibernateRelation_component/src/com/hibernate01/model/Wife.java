package com.hibernate01.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wife {
	
	private String wifename;
	private int age;
	
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWifename() {
		return wifename;
	}

	public void setWifename(String wifename) {
		this.wifename = wifename;
	}



}

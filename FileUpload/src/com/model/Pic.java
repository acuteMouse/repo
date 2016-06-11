package com.model;

import java.sql.Blob;

public class Pic {
	private int id;
	private Blob file;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Blob getFile() {
		return file;
	}
	public void setFile(Blob file) {
		this.file = file;
	}
	
}

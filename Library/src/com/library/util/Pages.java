package com.library.util;

//分页类
public class Pages {
	private int index=0;	//页标 第一页 为数据库的
	private int count; // 总页数
	private int pagesize=10; // 每页的条数

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	
}

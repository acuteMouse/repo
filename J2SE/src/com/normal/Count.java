package com.normal;

public class Count {
	private int count;
	
	public Count(int a) {
		count = a;
	}
	public static void main(String[] args) {
		Count c=new Count(4);
		System.out.println(c.count);
	}
}

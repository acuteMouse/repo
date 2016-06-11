package com.normal;
public class TestString {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("test");
		boolean exit = true;
		sb.append(exit);
		char c = 'a';
		sb.append(c);
//		Object ob = new Object();
//		sb.append(ob);
		int count = sb.capacity();// 放回缓冲区容量大小
		System.out.println(count);
		StringBuffer sf = sb.deleteCharAt(0);
		System.out.println(sb.toString());
		System.out.println(sf.toString());
	}
}

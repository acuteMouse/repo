package com.string;

public class Revese {
		public  static String getRevese(String string){
			StringBuffer stringBuffer=new StringBuffer(string);
			stringBuffer.reverse();
			System.out.println(stringBuffer.capacity());//capacity(string s)，容量是初始容量+s.length();
			return stringBuffer.toString();
		}
		public static void main(String[] args) {
			System.out.println(getRevese("abc")); 
			
		}
}

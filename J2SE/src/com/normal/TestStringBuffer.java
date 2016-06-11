package com.normal;
import java.util.Arrays;


public class TestStringBuffer {
		public static void main(String[] args) {
			StringBuffer sf=new StringBuffer();
			sf.append("hello world");
			System.out.print(sf);
			System.out.println(sf.reverse());  //逆序化
			int [] a={5,10,96,32,15,63,18};
			Arrays.sort(a);
		}
}

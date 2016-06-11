package com.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringReaderInput {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("e:计划.txt"), "gbk");//编码设置为u8不顶用，gbk才好使
		BufferedReader br=new BufferedReader(isr);
		String s;
		StringBuffer sb=new StringBuffer();
		while ((s= br.readLine())!=null) {
			sb.append(s +"\n"); 
		}
		System.out.println(sb.toString());
	}
}

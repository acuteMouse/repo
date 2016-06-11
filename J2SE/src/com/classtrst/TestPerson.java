package com.classtrst;

import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
	@Test
	public void test1(){
		Person p=new Person("张三", 25);
		Person n=p;
		Assert.assertTrue(n==p);
		System.err.println(p.toString()); //err 输入警告信息
	}
	@Test
	public  void test2(){
		byte a=127;
		byte b=(byte) (a+1);
		System.out.println(b);
	}
	@Test
	public void test3(){
		String s="h";
		s="s";
		System.out.println(s);
		
	}
}

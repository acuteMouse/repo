package com.collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestCurrentHashMap {
	public static void main(String[] args) {
		//并发hashmap ,使用大量segment,不允许值为空
		ConcurrentHashMap<String, String> chm=new ConcurrentHashMap<String, String>();
		HashMap<String, String> hp=new HashMap<String, String>();
//		chm.put("e", null);
		hp.put(null, null);
		Object o=new Object(){};
		System.out.println(o);
	}
}	

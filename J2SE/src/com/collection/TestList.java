package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.remove(5);
//		list.remove(3);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println(list.indexOf(2));
		
	}
	
}

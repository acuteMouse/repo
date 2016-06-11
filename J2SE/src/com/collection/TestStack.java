package com.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class TestStack {
	/*
	 * 出栈
	 */
	public static void popStack(LinkedList<Integer> linkedList) {
		linkedList.removeLast();
	}

	/*
	 * 入栈
	 */
	public static void pullStack(LinkedList<Integer> linkedList, Integer i) {
		linkedList.add(i);

	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Integer[] n = { 1, 2, 3, 4, 5, 6 };
		list.addAll(Arrays.asList(n));
		for (Integer i : list) {
			System.out.print(i);
		}
		System.out.println("");
		System.out.println(list.size() + "长度");
		// pullStack(list, 7);
		while (!list.isEmpty()) {
			popStack(list);    //出栈至空
		}
		for (Integer i : list) {	
			System.out.print(i); 	//没有输出
		}
	}
}
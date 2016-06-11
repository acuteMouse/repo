package com.collection;

import java.util.LinkedList;
/**
 * LinkedList 具有队列的功能，可以在头部或者尾部添加删除元素
 * @author Administrator
 *
 */
public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
	Integer i=	list.removeFirst();
	list.addFirst(1);
	for (Integer integer : list) {
		System.out.println(integer);
	}
	System.out.println(i);
	}
}

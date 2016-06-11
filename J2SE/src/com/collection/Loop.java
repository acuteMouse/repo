package com.collection;

import java.util.Arrays;
import java.util.LinkedList;


/**
 * 首尾相连循环输出
 * 模拟队列
 * @author Administrator
 * 
 */
public class Loop {
	public static void loop(LinkedList<Integer> linkedList){
		while (true) {
			int head = linkedList.removeFirst();
			linkedList.addLast(head);
			for (Integer integer : linkedList) {
				System.out.print(integer);
			}
			System.out.println();

		}
		
	}
	public static void main(String[] args) {
			LinkedList<Integer> list=new LinkedList<Integer>();
			Integer[] n={1,2,3,4,5,6};
			list.addAll(Arrays.asList(n));
			loop(list);
		}
}

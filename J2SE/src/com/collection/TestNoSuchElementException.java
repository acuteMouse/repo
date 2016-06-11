package com.collection;

import java.util.LinkedList;

public class TestNoSuchElementException {
		public static void main(String[] args) {
			try {
				LinkedList<Integer> list=new LinkedList<Integer>();
				list.removeFirst();
			} catch (Exception e) {
				System.out.println("列表为空");
				e.printStackTrace();
			}
		}
}

package com.collection;

import java.util.HashSet;
import java.util.Random;

public class TestSet {
	public static void main(String[] args) {
		Random rand=new Random(47);
		java.util.Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < 1000; i++) {
			set.add(rand.nextInt(50));
		}
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}

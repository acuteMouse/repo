package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAll {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Integer[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		numbers.addAll(Arrays.asList(n));
		for (Integer integer : n) {
			System.out.println(integer);
		}
	}
}

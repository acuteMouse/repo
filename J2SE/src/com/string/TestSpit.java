package com.string;

public class TestSpit {
	public static void main(String[] args) {
		String s="hellp.word";
		String str[]=s.split("\\.");
		System.out.println(str.length);
		for (String string : str) {
			System.out.println(string);
		}
	}
}

package com.normal;
public class loop {
	public static void main(String[] args) {

		int count = 0; // 计数
		int i = 20;
		while (i <= 1000) {
			count++;
			System.out.println(i);
			i += 20;
		}
		System.out.println(count);
	}
}

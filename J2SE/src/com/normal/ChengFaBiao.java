package com.normal;
/*
 * 一个循环实现乘法表
 */
public class ChengFaBiao {
	public static void main(String[] args) {
		for (int i = 1, j = 1; i < 10; j++) {
			System.out.print(i + "*" + j + "=" + i * j + " ");
			if (i == j) {
				j = 0;
				i++;
				System.out.println(" ");
			}

		}
	}
}

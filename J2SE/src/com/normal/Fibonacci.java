package com.normal;
/*
 * 递归实现斐波那契数列
 * f0=0 f1=1
 * 时间复杂度O(n);
 */
public class Fibonacci {
	public int f(int n) {
		if (0 == n) {
			return 0;

		}
		if (1 == n) {
			return 1;
		}
		return f(n - 1) + f(n - 2);

	}

	public static void main(String[] args) {
		System.out.println(new Fibonacci().f(10));
	}
}

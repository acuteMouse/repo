package com.normal;
public class JieCheng {
	public static int JC(int n) {
		int sum = 1;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				sum *= i;
			}
			return sum;
		} else {
			return sum = 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(JC(0));
		System.out.println(JC(2));
		System.out.println(JC(4));
		System.out.println(JC(8));

	}
}

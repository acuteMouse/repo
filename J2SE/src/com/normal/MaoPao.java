package com.normal;

public class MaoPao {
	public static void sort(int[] a) {
//		int temp = 0;
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (a[j + 1] < a[j]) {
//					temp = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = temp;
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];  //使用异或减少一个变量的使用
					a[j+1]=a[j]^a[j+1];
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] number = { 5, 15, 63, 21, 36, 85, 3 };
		 sort(number);
//		Arrays.sort(number);
		for (int i : number) {
			System.out.println(i);
		}
	}

}

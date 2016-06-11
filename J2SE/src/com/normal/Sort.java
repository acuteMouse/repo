package com.normal;
/**
 * 排序
 * @author 陈桂林
 * 含有N个数的数组 需要比较的次数是 n*(n+2)/2
 */
public class Sort {
	/*
	 * version1 升序排列
	 */
	public static void insertSort(int a[]) {
		for (int i = 2; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i]) {
					a[j] = a[j] ^ a[i];
					a[i] = a[j] ^ a[i];
					a[j] = a[j] ^ a[i];
				}
				continue;
			}
		}

	}
	/*
	 * version 2 降序排列
	 */
	public static void insertSort2(int a[]) {
		for (int i = 2; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					a[j] = a[j] ^ a[i];
					a[i] = a[j] ^ a[i];
					a[j] = a[j] ^ a[i];
				}
				continue;
			}
		}

	}
	
	public static void main(String[] args) {
		int a[]={3,5,5,1466,32,967,1,4678,20,267,542};
		insertSort(a);
//		for (int i : a) {
//			System.out.print(i+" ");
//		}
//		System.out.println("   ");
//		insertSort2(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

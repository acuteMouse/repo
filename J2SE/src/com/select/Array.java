package com.select;

public class Array {
	long[] n;

	// 生成1-i的数组
	public Array(int i) {
		n = new long[i];
		for (int j = 0; j < i; j++) {
			n[j] = j + 1;
		}
	}

	/*
	 * 顺序查找法 判断两次 时间复杂度O(n)
	 */
	public static int findByOrder(long a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return 0;
	}

	/*
	 * 优化的顺序查找 只要判断一次 时间复杂度O(n)
	 */
	public static int findByOrderFaster(long a[], int key) {
		a[0] = key;
		int i = a.length;
		while (a[i] != key) {
			i--;
		}
		return i;
	}

	/*
	 * 二分查找 时间复杂度为O(logn)
	 * 数组a是有序的
	 * @reuturn 数组下标
	 */
	public static int binarySearch(long a[], int key) {
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		if (key<a[low]||key>a[high]) {
			return -1;
		}
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		Array a = new Array(500);
		// int i = findByOrder(a.n, 49);
		// long nu[]=a.n;
		// for (long l : nu) {
		// System.out.println(l);
		// }
		int i = binarySearch(a.n, 5000);
		System.out.println(i);
	}
}

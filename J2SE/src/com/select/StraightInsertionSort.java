package com.select;

public class StraightInsertionSort {
	public static void ssort(int[] a) {
		for (int i = 1; i < a.length; i++)// 第0位独自作为有序数列，从第1位开始向后遍历
		{
			if (a[i] < a[i - 1])// 0~i-1位为有序，若第i位大于i-1位，继续寻位并插入，否则认为0~i位也是有序的，忽略此次循环，相当于continue
			{
				int temp = a[i];// 保存第i位的值
				int k = i - 1;
				for (int j = k; j >= 0 && temp < a[j]; j--)// 从第i-1位向前遍历并移位，直至找到小于第i位值停止
				{
					a[j + 1] = a[j];
					k--;
				}
				a[k + 1] = temp;// 插入第i位的值
			}
		}
	}
	//
	public static void sort(int a[]){
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			for (int j = i-1; j>=0; j--) {
				if (a[j+1]<a[j]) {
					a[j+1]=a[j];
					a[j]=temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 100, 25,1,100, 36, 15,-3,15,0, 20 };
		StraightInsertionSort.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}

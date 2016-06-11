package com.normal;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * 求两个序列的公共元素构成的序列,不计重复元素
 * @author Administrator
 *
 */
public class Same {
	/*
	 * version 1
	 */
	public static Set<Integer> getSame(int a[],int b[]){
		java.util.Set<Integer> same=new HashSet<Integer>();
		for (int i : b) {
			for (int j : a) {
				if (i==j) {
					same.add(i);
				}
				
			}
		}
		return same;
	}
//	/*
//	 * version 2
//	 */
//	public static Set<Integer> getSame2(int a[],int b[]){
//		Set same=new HashSet<Integer>();
//		
//		return same;
//	}
	public static void main(String[] args) {
		int a[]={1,2,3,5,6,6,7,};
		int b[]={1,2,3,4,5,6,6};
		Long startTime=Calendar.getInstance().getTimeInMillis();
		Set<Integer> getSame=getSame(a, b);
		for (Object object : getSame) {
			System.out.print(object);
		}
		System.out.println("执行了"+(Calendar.getInstance().getTimeInMillis()-startTime)+"毫秒");
	}
}

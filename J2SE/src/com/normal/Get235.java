package com.normal;

public class Get235 {
		static void getNum(int n){
			int count=0;
			for (int  i = 1; i>0; i++) {
				if (i%2==0||i%3==0||i%5==0) {
					count++;
					System.out.println(i);
					if (count==n) {
						break;
					}
				}
			}
		}
		public static void main(String[] args) {
			getNum(1500);
		}
}

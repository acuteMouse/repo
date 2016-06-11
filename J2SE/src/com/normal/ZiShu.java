package com.normal;
public class ZiShu {
	public	static boolean isPrime(int endNumber){
				boolean flag=true;
				for (int i = 2; i < endNumber; i++) {
					if (endNumber%i==0) {
						flag=false;
						break;
					}
				}
				return flag;
			}
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
}

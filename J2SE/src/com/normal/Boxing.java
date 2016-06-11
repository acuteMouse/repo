package com.normal;

public class Boxing {
	public static void main(String[] args) {
		Integer i=42;
		long l=42l;
		//都是包装类时，不会自动拆箱，编译错误
		if (i==l) {
			
		}
	}
}

package com.classtrst;

import java.lang.reflect.Method;

public class TestMethod {
	public static void main(String[] args) throws Exception {
//		Person p = new Person("二", 25);
		Class<?> clazz = Class.forName("com.classtrst.Person");
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.isInterface());
		System.out.println(clazz.getName());
		System.out.println(clazz.getCanonicalName());
		Method pMethod = clazz.getDeclaredMethod("print", new Class[] {
				String.class, Integer.class });
		pMethod.setAccessible(true);
		String name = pMethod.getName();
		System.out.println(name);
//		pMethod.invoke(p, new Object[] { "四", 15 });
//		System.out.println(string);
	}
}

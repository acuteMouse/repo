package com.string;

import java.lang.reflect.Field;

public class ChangString {
	public String s = "56t";

	public void changString(String s) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field=s.getClass().getDeclaredField("value");
		field.setAccessible(true);
		char []values=(char[]) field.get(s);
		values[0]='r';
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ChangString cs = new ChangString();
		System.out.println("初始化: "+cs.s);
		cs.changString(cs.s);
		System.out.println("变化之后: "+cs.s);
	}
}

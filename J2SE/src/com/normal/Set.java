package com.normal;

import java.util.TreeSet;

/**
 * 消除重复的字母
 * 
 * @author Administrator
 * 
 */
public class Set {
	public static String getShortString(String string) {
		java.util.Set<String> stringSet = new TreeSet<String>();
		for (int i = 0; i < string.length(); i++) {
			String temp = string.charAt(i) + "";
			stringSet.add(temp);
		}
		Object[] s = stringSet.toArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]);
		}
		return sb.toString();
		// return s;
	}

	public static void main(String[] args) {
		System.out.println(getShortString("aaabbbbcccc"));
	}
}
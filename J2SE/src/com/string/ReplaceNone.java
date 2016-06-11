package com.string;

public class ReplaceNone {
	public String replace(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.toString().length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append("%20");
				continue;
			}
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = new ReplaceNone().replace(new StringBuffer(" "));
		System.out.println(s);
	}
}

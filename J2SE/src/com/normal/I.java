package com.normal;

public class I {
	//逆序输出字符
	static String getString(String string) {
		StringBuffer sb = new StringBuffer();
		return sb.append(string).reverse().toString();

	}

	public static void main(String[] args) {
		System.out.println(getString("This is nowcoder"));
		String s = "hello";
		String[] stringList = s.split("");	//依次输出每个字母
		for (String string : stringList) {
			System.out.println(string);
		}
	}
}
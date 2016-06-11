package com.normal;
/**
 * 字符串压缩
 * @author Administrator
 *
 */
public class Zapper {
	public static void ZipString(String string){
		String[] stringList=string.split("");
		StringBuffer sb=new StringBuffer();
		sb.append(stringList[0]);
		for (int i = 1; i < stringList.length; i++) {
			if (!stringList[i-1].equals(stringList[i])) {
				sb.append(stringList[i]);
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		ZipString("aabbbsssssscccaaaa");
	}
}


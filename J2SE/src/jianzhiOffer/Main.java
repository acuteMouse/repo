package jianzhiOffer;

public class Main {
	public static int getLength(String str) {
		if (str==null||"".equals(str)) {
			return 0;
		}
		String[] str2 = str.split(" ");
		return str2[str2.length-1].toString().length();
	}
	public static void main(String[] args) {
		String s="";
		System.out.println(getLength(s));
	}
}

package com.normal;

public class TestFuZhi {
	public static void main(String[] args) {
		int a=100;
		short b=(short) a;	//大赋小 需要强转
		double c=a;			//整赋 double  输出加  .0;
		long d=a;		//小赋大,不需要强转;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		String s="hello";
		String st=new String("hello");
		String string ="hello";
		System.out.println(s==st);		
		System.out.println(s==string);	//引用不同,但是是同一个对象,输出 true,从常量池里取出 所以是同一个对象
		System.out.println(a==b);
		System.out.println(st==string);	//== 比较应用类型数据时比较的的是对象是否相等,比较基本类型 和equal()方法相同
		System.out.println(st.equals(string));	//equal()方法比较值
	}
}

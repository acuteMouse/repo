package com.normal;

public class SuperClass {
	final int id = 5;

	public int getMax(int x, int y) {
		System.out.println("父类的");
		return x;
	}

	public static void main(String[] args) {
		SuperClass sc = new SubClass();
		// SuperClass sc=new SuperClass();
		 SubClass sub=new SubClass();
		sc.getMax(5, 10);
		System.out.println(sc.id);
		System.out.println(sub.id);
		

	}
}

class SubClass extends SuperClass {
		int id=50;

	// public double getMax(int x,int y){ //子类方法与父类方法名一致，参数列表一直，返回类型不一致。编译不通过
	public int getMax(int x, int y) {
		
		System.out.println("子类的");
		return y;
	}
}
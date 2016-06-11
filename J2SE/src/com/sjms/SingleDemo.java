package com.sjms;

/**
 * 饿汉模式单例,使用与单线程
 * 饿汉式是 类加载的时候就已经初始化了,用的时候直接用,  饿了就用,是谓 '饿'
 * @author Administrator
 * 单例和多线程并不同
 */
public class SingleDemo {
	private String name;
	private int age;
	private static SingleDemo singleDemo = new SingleDemo();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private SingleDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private SingleDemo() {
	}

	public static SingleDemo getSingleDemo() {
			return singleDemo;
	}

	public static void main(String[] args) {
		SingleDemo s1 = SingleDemo.getSingleDemo();
		SingleDemo s2 = SingleDemo.getSingleDemo();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}

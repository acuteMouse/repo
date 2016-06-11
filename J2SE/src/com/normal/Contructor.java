package com.normal;
public class Contructor {
	String s; // 初始化 null, 定义时初始化就相当于一个默认值。需要使用默认值时，用这种方法比较方便。
	int i; // 0
	short sh; // 0
	long l; // 0
	char ch;
	boolean b; // false
	float f; // 0.0
	double d;// 0.0

	public Contructor(String i) { // 定义有参构造器
		this.s = i; // 使用有参构造器初始化灵活，想初始化成什么值就初始化什么值，
		// 当不同的对象需要不同的值就是使用这种初始化方法比较好
	}

	public void f(int c) {
		System.out.println(c); // char 型的将会自动转型为int
	}

	public Contructor() { // 定义无参构造器
		super();
	}

	public static void main(String[] args) {
		Contructor c = new Contructor("5");
		@SuppressWarnings("unused")
		Contructor co = new Contructor(); // 类里如果有了有参构造器，想要使用无参构造器必须定义，否则不能使用无参构造器
		c.f('a'); // 输出 97 即 对应的ASCII码值
		System.out.println(c);
		System.out.println(c.s);
		System.out.println(c.i);
		System.out.println(c.sh);
		System.out.println(c.l);
		System.out.println(c.ch);
		System.out.println(c.b);
		System.out.println(c.f);
		System.out.println(c.d);
	}
}

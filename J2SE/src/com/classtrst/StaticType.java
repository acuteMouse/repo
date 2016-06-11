package com.classtrst;

class Human {
}

class Man extends Human {
}

class Women extends Human {
}

public class StaticType {

	public void sayHello(Human h) {
		System.out.println("hello,guy");
	}

	public void sayHello(Man h) {
		System.out.println("hello,man");
	}

	public void sayHello(Women h) {
		System.out.println("hello,lady");
	}

	public static void main(String[] args) {
		Human m = new Man();
		Human w = new Women();
		StaticType st = new StaticType();
		st.sayHello(m);
		st.sayHello(w);
	}
}

package com.normal;

public class TestExtends {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		B b=new B(5);
//		D d =new D();
	}
}
class A{
	
	public A(int id) {
		
		this.id = id;
		System.out.println("A  ");
	}

	int id;
}
class B extends A{
	
	public B(int id) {
		super(id);
		System.out.println("B");
	}
	
}
class C {
	

	public C() {
		super();
		
	}
	
	
}
class D extends C{
	String name;

	public D() {
		super();
	}
	
	
}
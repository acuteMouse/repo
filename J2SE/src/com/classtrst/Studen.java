package com.classtrst;

public class Studen extends Person {

	public Studen() {
		super();
		System.out.println("sub");
	}

	public Studen(String name, Integer age) {
		super(name, age);
		System.out.println("null");
	}
	public static void main(String[] args) {
		Person p=new Studen();
		p.toString();
	}
}

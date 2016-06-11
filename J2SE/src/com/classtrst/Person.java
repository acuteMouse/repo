package com.classtrst;

public class Person {
	private String name;
	private Integer age;
	public Person() {
		System.out.println("spuer");
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@SuppressWarnings("unused")
	private void print(String name,Integer age){
		System.out.println(name+" "+ age);
	}
}

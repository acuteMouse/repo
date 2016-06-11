package com.sjms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
public static void main(String[] args) {
	ExecutorService es=Executors.newCachedThreadPool();
	es.execute(new Singleton());
	es.execute(new Singleton());
	es.execute(new Singleton());
	es.execute(new Singleton());
	es.shutdown();
}

}
class Singleton implements Runnable{
		SingleDemo singleDemo;
	@Override
	public void run() {
		int age=20;
		singleDemo=SingleDemo.getSingleDemo();
		singleDemo.setAge(age);
		System.out.println(singleDemo.getAge());
		age++;
	}
	
}
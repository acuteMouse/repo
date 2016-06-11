package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCar {
	public static void main(String[] args) {
		Car car=new Car();
		ExecutorService es=Executors.newCachedThreadPool();
		es.execute(new WaxOff(car));
		es.execute(new WaxOn(car));
		es.shutdown();
	}
}

package com.sjms.simpleFactory;

public class CarFactory {

	public Car getCar(String s) {
		if ("auto".equals(s)) {
			return new Auto();
		} else if ("audi".equals(s)) {
			return new Audi();
		} else if ("benz".equals(s)) {
			return new Benz();
		} else {
			return new BMW();	//默认返回宝马
		}
	}
}

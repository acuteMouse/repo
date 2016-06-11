package com.sjms.factory;
//奔驰工厂
public class BenzFactory implements CarFactory {

	@Override
	public Car getCar() {
		
		return new Benz();	//返回奔驰对象
	}

}

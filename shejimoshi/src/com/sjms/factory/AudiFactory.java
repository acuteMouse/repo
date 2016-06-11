package com.sjms.factory;

//奥迪工厂
public class AudiFactory implements CarFactory {

	@Override
	public Car getCar() {
		
		return new Audi();	//返回奥迪对象
	}

}

package com.sjms.factory;

import org.junit.Test;

public class TestCarFactory {

	@Test	//奔驰
	public void testGetBenz() {
		Car benz= new BenzFactory().getCar();
		benz.run();
	}
	@Test	//奥迪
	 public void testGetAudi(){
		Car audi=new AudiFactory().getCar();
		audi.run();
	}
}

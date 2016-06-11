 package com.sjms.simpleFactory;

import org.junit.Test;

public class TestCarFactory {
	
		
	private static CarFactory carFactory=new CarFactory();
		
	@Test
	public void testGetBenz() {
		
		Car	benz=carFactory.getCar("benz");
			benz.Run();
	}
	@Test
	public void testGetBmw(){
		Car bmw=carFactory.getCar("bmw");
		bmw.Run();
		
	}
	 @Test
	 public void testGetAudi(){
		 Car audi=carFactory.getCar("audi");
		 audi.Run();
	 }
	 @Test
	 public void testGetAuto(){
		 Car auto=carFactory.getCar("auto");
		 auto.Run();
	 }
}

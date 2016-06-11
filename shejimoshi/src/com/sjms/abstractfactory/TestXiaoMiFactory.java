package com.sjms.abstractfactory;

import org.junit.Test;

public class TestXiaoMiFactory {

	private static abstractFactory ls = new XiaoMiFactory();
	
	@Test
	public void testCreatePhone() {
		ls.createPhone().getName();
	} 

	@Test
	public void testCreateTV() {
		ls.createTV().show();
	}

}

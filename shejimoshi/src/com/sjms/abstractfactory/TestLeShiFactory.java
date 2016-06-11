package com.sjms.abstractfactory;

import org.junit.Test;

public class TestLeShiFactory {

	private static abstractFactory ls = new LeShiFactory();
	
	@Test
	public void testCreatePhone() {
		ls.createPhone().getName();
	}

	@Test
	public void testCreateTV() {
		ls.createTV().show();
	}

}

package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import com.junit.JUnit;

public class JUintTest {

	/**
	 * 
	 */
	@Test
	public void testAdd() {
	int z=new JUnit().add(4, 5);
	assertThat(z, is(9));
	}

}

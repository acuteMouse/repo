package com.junit.test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import com.junit.User;

public class UserTest {

	@Test
	public void testGetname() {
			assertThat(new User().getname(), is("shabi"));
		}

}

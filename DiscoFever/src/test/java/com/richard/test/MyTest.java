package com.richard.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {
	
	@Test
	public void test() {
		assertEquals("True is any true", true, true);
	}
	@Test
	public void fail() {
		assertNotEquals("True is false", true, false);
	}

}

package com.select;

import org.junit.Test;


public class TestFindByOrder {
	@Test
	//0.33-0.34s
	public void test1(){
			Array a=new Array(87000000);
			Array.findByOrder(a.n, 87000000);
	}
	@Test 
	//0..33s
	public void test2(){
		Array a=new Array(87000000);
		Array.findByOrder(a.n, 87000000);
	}
	@Test
	//0.27s
	public void testBinarySearch(){
		Array a=new Array(870000000);
		Array.binarySearch(a.n,87000000/2);
	}
	
}

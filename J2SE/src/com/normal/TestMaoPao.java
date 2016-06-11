package com.normal;

import org.junit.Test;


public class TestMaoPao {
	@Test
	public void testMaopao(){
		int[] number = { 5, 15, 63, 21, 36, 85, 3 };
		MaoPao.sort(number);
		for (int i : number) {
			System.out.print(i+" ");
		}
	}
}

package com.normal;

import java.util.Arrays;

public class TestArrays {
		public static void main(String[] args) {
			int number[]={13,35,4564,242,79,246265,94343};
			for (int i : number) {
				System.out.print(i+" ");
			}
			System.out.println("==========");
			Arrays.sort(number);
			for (int i : number) {
				System.out.print(i+" ");
			}

		}
}

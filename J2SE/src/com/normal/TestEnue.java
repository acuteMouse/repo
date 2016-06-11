package com.normal;

public class TestEnue {
	public static void main(String[] args) {
		System.out.println(Account.ONE);
	}
}
 enum Account{
	 ONE,TWO,THRESS;
	 private Account(){
		 System.out.println("It is a account type");
	 }
 }
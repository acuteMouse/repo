package com.normal;

import java.math.BigInteger;
import java.util.Random;

public class StaticFactory {
	public static void main(String[] args) {
		BigInteger prime=BigInteger.probablePrime(3, new Random());
		System.out.println(prime);
	}
}

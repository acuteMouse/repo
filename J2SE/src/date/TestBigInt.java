package date;

import java.math.BigInteger;
import java.util.Random;

public class TestBigInt {
	public static void main(String[] args) {
		 BigInteger bi=BigInteger.probablePrime(3, new Random() );
		 System.out.println(bi);
		 System.out.println("------");
//		 ZiShu.getPrime(400, 800);
	}
	
}

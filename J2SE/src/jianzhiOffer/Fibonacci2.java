package jianzhiOffer;
/**
 * 利用循环求 fibonacci数
 * @author 陈桂林
 *
 */
public class Fibonacci2 {
	public int f(int n) {
		int sum = 0;
		int First = 0;
		int Second = 1;
		for (int i = 1; i <= n; i++) {
			First = Second;
			Second = sum;
			sum = First + Second;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new Fibonacci2().f(50));
	}
}

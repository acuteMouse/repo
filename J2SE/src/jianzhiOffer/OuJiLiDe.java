package jianzhiOffer;

/**
 * 阿基里的算法求最大公约数
 * 
 * @author 陈桂林
 * 
 */
public class OuJiLiDe {
	public static int getMaxYueShu(int m, int n) {
		while (n != 0) {
			int temp = m % n;
			m = n;
			n = temp;
		}
		return m;
	}

	public static void main(String[] args) {
		System.out.println(getMaxYueShu(16, 12));
	}
}

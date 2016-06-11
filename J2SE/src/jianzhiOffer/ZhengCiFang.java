package jianzhiOffer;
/**
 * 不用公式 求 base的exponent次方
 * base,底数
 * exponent ,幂
 *  * @author 陈桂林
 *
 */
public class ZhengCiFang {
	public double Power(double base, int exponent) {
		double sum = 1;
		if (exponent == 0) {

		} else if (exponent > 0) {
			for (int i = 0; i < exponent; i++) {
				sum *= base;
			}
		} else if (exponent < 0) {
			for (int i = 0; i > exponent; exponent++) {
				sum *= base;
			}
			sum = 1 / sum;
		}
		return sum;
	}
	//数学公式
	public double Power2(double base, int exponent){
		return Math.pow(base, exponent);
	}

	public static void main(String[] args) {
		System.out.println(new ZhengCiFang().Power(2, -3));
		System.out.println(new ZhengCiFang().Power(2, 0));
		System.out.println(new ZhengCiFang().Power(2, 5));
		System.out.println(new ZhengCiFang().Power2(5, 0));
	}
}

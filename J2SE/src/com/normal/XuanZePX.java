package com.normal;
public class XuanZePX {
	static void getSorts(int[] number) {
		int[] n = new int[number.length];
		for (int i = 0; i < n.length; i++) {
			n[i] = getMax(number);
			System.out.println(n[i]);
		}

	}

	static int getMax(int number[]) {

		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int[] number = { 5, 20, 15, 30, 1, 26, 960 };
		getSorts(number);
	}

}

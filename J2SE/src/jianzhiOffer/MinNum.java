package jianzhiOffer;

import java.util.Arrays;

public class MinNum {
	 public int minNumberInRotateArray(int [] array) {
		 	if (array.length<=0) {
				return 0;
			}
		    Arrays.sort(array);
		    return array[0];
	    }
}

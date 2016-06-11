package com.normal;
import java.util.ArrayList;
import java.util.List;


public class TestList {
		public static void main(String[] args) {
			List<String>	sList=new ArrayList<String>();
			sList.add("a");
			sList.add("b");
			sList.add("c");
			sList.add("d");
			for (String string : sList) {
				string+="x";
				System.out.println(string);
			}
//			List<String>	newList=sList.s
		}
}

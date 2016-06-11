package cn.itcast.listener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s.equals("ccc")){
				it.remove();
			}
		}
	}

}

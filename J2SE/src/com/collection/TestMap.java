package com.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(1l, "一");
		map.put(17l, "一");
		map.put(2l, "二");
		map.put(18l, "二");
		map.put(3l, "三");
		map.put(4l, "四");
		map.put(5l, "五");
		map.put(6l, "五");
		map.put(7l, "五");
		map.put(1596594864954515l, "五");
		for (Map.Entry<Long, String> entry : map.entrySet()) {
			System.out.println(entry.getKey().hashCode());
			System.out.println(entry.getValue());
		}
//		map.keySet();
//		System.out.println(i);
	}
	
}

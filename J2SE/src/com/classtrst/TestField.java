package com.classtrst;

import java.lang.reflect.Field;

/**
 * 修改private属性
 * 
 * @author Administrator
 * 
 */

public class TestField {
	/**
	 * @param args
	 * @throws Exception
	 * @throws SecurityException
	 */
	public static void main(String[] args) throws Exception, SecurityException {
		Person p = new Person("一", 1); // 实例化Person对象
		System.out.println(p);
		Class<? extends Person> clazz = p.getClass();// 获取Person的class对象
		Field pName = clazz.getDeclaredField("name"); // 根据class对象 拿到private属性字段
		Field pAge = clazz.getDeclaredField("age");
		pAge.setAccessible(true); // 设置是否允许访问
		pAge.set(p, 20); // 修改private 属性 新值，第一个参数：对象，第二哥：field字段代表的属性的 新值
		pName.setAccessible(true);
		pName.set(p, "二");
		System.out.println(p);

	}
}

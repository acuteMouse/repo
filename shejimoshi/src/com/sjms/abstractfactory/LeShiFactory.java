package com.sjms.abstractfactory;

//乐视工厂
public class LeShiFactory extends abstractFactory {

	@Override
	public Phone createPhone() {

		return new LeShiPhone(); // 返回乐视手机对象
	}

	@Override
	public TV createTV() {
		return new LeShiTV(); // 返回乐视电视对象
	}

}

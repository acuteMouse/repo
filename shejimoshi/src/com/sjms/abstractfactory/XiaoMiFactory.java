package com.sjms.abstractfactory;

//小米工厂
public class XiaoMiFactory extends abstractFactory {

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		return new XiaoMiPhone();// 返回小米手机对象
	}

	@Override
	public TV createTV() {

		return new XiaoMiTv(); // 返回小米电视对象
	}

}

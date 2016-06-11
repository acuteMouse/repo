package com.sjms.abstractfactory;


//定义抽象工厂
public abstract class abstractFactory {
		public abstract Phone createPhone();	//定义生产电话的方法
		public abstract TV createTV();	//生产电视的方法
}

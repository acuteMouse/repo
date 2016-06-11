package com.thread;

public class TestRunnable implements Runnable {

	int i = 0;
	@Override
	public void run() {
		while (i<1000) {
			i++;
			System.out.println(i);
		}

	}
	/*
	 * 创建线程的方式有两种,1 继承thread类,重写run方法.2 实现runnable接口的run方法
	 * 开启线程必须把线程附着到thread类上,调用start()来启动线程
	 */
		public static void main(String[] args) {
			TestRunnable tr=new TestRunnable();
//			tr.start();		//报错,说明只实现了runnable接口的类并不能启动一个新的线程
			new Thread(tr).start();		//开启线程的方法必须是 把实现runnable接口的类 附着到 thread类上
		}
}

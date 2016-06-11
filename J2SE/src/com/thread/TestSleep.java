package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestSleep implements Runnable {
	static int i=0;
	int id=i++;
	@Override
	public void run() {
		
		System.out.println("线程"+id);
			}

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < 20; i++) {
			int sleepTime = (int) (Math.random() * 10 + 1);
			es.execute(new TestSleep());
			try {
				TimeUnit.MILLISECONDS.sleep(sleepTime*1000);//参数以毫秒为准,程睡眠需要在线程开启之后,在Run方法中sleep并不管用
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("睡眠了:"+sleepTime + "秒");

		}
	}
}

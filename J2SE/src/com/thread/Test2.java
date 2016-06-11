package com.thread;

import java.util.concurrent.TimeUnit;

public class Test2  implements Runnable{
	int i=0;
	@Override
	public void run() {
			while (i<3) {
				System.out.println(i);
				i++;
				try {
					TimeUnit.MILLISECONDS.sleep(5000);//线程暂停
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Thread(new Test2()).start();
		}
		System.out.println("over");
	}
}

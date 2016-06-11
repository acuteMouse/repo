package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Count {

	public static volatile int count;	//volatile 关键字并不能保证线程安全
	int a;
	public static void inc() {

		// 这里延迟1毫秒，使得结果明显
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}

		count++;
	}

	public static void main(String[] args) {
		ExecutorService es=Executors.newCachedThreadPool();
		
		for (int i = 0; i < 500; i++) {
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					Count.inc();
					
				}
			});
		// 这里每次运行的值都有可能不同,可能为1000
	}
		es.shutdown();	//关闭线程池,保证提交的任务都执行完毕.
		System.out.println("运行结果:Counter.count=" + Count.count);//输出结果不一定是500,所以,volatile修饰的并不能保证线程安全
	}}

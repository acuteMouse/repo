package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
	public static void main(String[] args) {
		// ExecutorService es=Executors.newCachedThreadPool(); //推荐,每一次都是新创建一个线程.
		ExecutorService es=Executors.newFixedThreadPool(5);	//限制了线程数
//		ExecutorService es = Executors.newSingleThreadExecutor();// 线程数唯一的FixedThreadPool,需要排队.长时间进行一个单独的线程可以使用这个
		for (int i = 0; i <7; i++) {
			es.execute(new test());
		}
	}
}

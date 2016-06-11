package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class TestPriorty implements Runnable{
	private int priority;
	

	public TestPriorty(int priority) {
		super();
		this.priority = priority;
	}


	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		System.out.println("线程优先级为:"+priority);
		
	}
	public static void main(String[] args) {
		ExecutorService es=Executors.newCachedThreadPool();
		for (int i = 0; i<10; i++) {
			es.execute(new TestPriorty(Thread.MAX_PRIORITY));	//10
			es.execute(new TestPriorty(Thread.MIN_PRIORITY));//1
			es.execute(new TestPriorty(Thread.NORM_PRIORITY));//5 ,默认为5
		}
		es.shutdown();  //shutdowm方法调用之后不再接受新的任务,当前队列中的线程执行完成之后就会关闭executorService
		try {
			es.execute(new TestPriorty(Thread.MIN_PRIORITY)); //报错RejectExecutionException,因为上面显示的调用shutdown()
		} catch (RejectedExecutionException e) {
			e.printStackTrace();
			System.out.println("线程池已经关闭,不能再提交任务");
		} 
	}
	}


package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int i = 0;
		int sum=0;
		while (i < 15) {
			i++;
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Integer> sums = ex.submit(new TestCallable());//submit()返回Future对象
		try {
			System.out.println(sums.get());//get()方法从返回的Future对象中把call方法中返回的参数值取出
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}

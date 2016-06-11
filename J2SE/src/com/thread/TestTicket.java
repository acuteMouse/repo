package com.thread;

import java.lang.Thread;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestTicket {
	public static void main(String[] args) {
//		 Ticket ticket = new Ticket();
//		 Thread t1 = new Thread(ticket);
//		 Thread t2 = new Thread(ticket);
////		 Thread t3 = new Thread(ticket);
//		 t1.start();
//		 t2.start();
////		 t3.start();
		ExecutorService es = Executors.newCachedThreadPool();
		Ticket ticket = new Ticket(); // 一个任务三个线程来执行,保证资源共享,使用synchronized

		es.execute(ticket);
		es.execute(ticket);
		es.execute(ticket);
		es.execute(ticket);
		es.execute(ticket);
		es.shutdown();
	}

}

class Ticket implements Runnable {
	private int ticket = 10;

	@Override
	public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (this) {
				if (ticket > 0)
					System.out.println(Thread.currentThread().getName()+ "车票 :" + ticket--);
			}
		}
	}

}
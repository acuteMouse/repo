package com.thread;

/**
 * 消费和生产者模式
 * 
 * @author Administrator
 * 
 */
public class Productor_Customer {
	public static void main(String[] args) {
		new Thread(new Customer(new Food())).start();
		new Thread(new Productor(new Food())).start();
	}

}

class Food {
	private int count = 0;

	/*
	 * 生产方法
	 */
	public synchronized void produce() {
		while (count != 0) {
			System.out.println("满了");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count++;
		System.out.println("P:" + count);
		notify();
	}

	/*
	 * 消费方法
	 */
	public synchronized void custom() {
		while (count == 0) {
			System.out.println("空了,等等再来吧");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count--;
		System.out.println(count);
		notify();
	}
}

/*
 * 生产者
 */
class Productor implements Runnable {
	private Food f;

	public Productor(Food f) {
		this.f = f;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			f.produce();
		}
	}

}

class Customer implements Runnable {
	private Food f;

	public Customer(Food f) {
		this.f = f;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			f.custom();
		}
	}

}
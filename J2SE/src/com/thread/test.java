package com.thread;

public class test implements Runnable {
	static int count = 0;

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("线程:" + count);
			System.out.println(i);
			i++;
		}
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new test());
		t1.start();
		t1.setName("name");
		t1.interrupt();
		System.out.println(t1.getName() + t1.getId() + t1.getPriority()
				+ t1.getState());
		Thread.sleep(5000);
		Thread t2 = new Thread(new test());
		t2.start();

	}

}

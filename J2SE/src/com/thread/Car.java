package com.thread;

public class Car {
	private boolean waxOn = false;// 是否抛光了

	/*
	 * 抛光
	 */
	public synchronized void waxed() {
		waxOn = true;
		notifyAll();
	}

	/*
	 * 打蜡
	 */
	public synchronized void buffed() {

		waxOn = false;
		notifyAll();
	}

	/*
	 * 检测是否需要抛光
	 */
	public synchronized void waitForWax() throws InterruptedException {
		while (waxOn == false) {
			wait();
		}
	}

	/*
	 * 检测是否需要打蜡
	 */
	public synchronized void waitForBuff() throws InterruptedException {
		while (waxOn == true) {
			wait();
		}
	}
}

class WaxOn implements Runnable {
	private Car car;

	public WaxOn(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		while (!Thread.interrupted()) {
			System.out.println("wax on!");
			car.waxed();
			try {
				car.waitForBuff();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class WaxOff implements Runnable {
	private Car car;

	public WaxOff(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		while (!Thread.interrupted()) {
			System.out.println("buff on!");
			car.buffed();
			try {
				car.waitForWax();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
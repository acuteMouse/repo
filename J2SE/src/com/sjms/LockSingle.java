package com.sjms;

/*
 * 双重锁式,线程安全的单例模式,可用于多线程
 */
public class LockSingle {
	private static LockSingle lockSingle = null;

	private LockSingle() {
	}

	private static LockSingle getLockSingle() {
		if (lockSingle == null) {
			synchronized (LockSingle.class) { // 加入同步语句块,确保线程安全

				lockSingle = new LockSingle();
			}
		}
		return lockSingle;
	}

	public static void main(String[] args) {
		LockSingle l1 = LockSingle.getLockSingle();
		LockSingle l2 = LockSingle.getLockSingle();
		System.out.println(l1 == l2);
	}
}

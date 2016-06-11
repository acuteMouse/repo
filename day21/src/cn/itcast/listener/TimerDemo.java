package cn.itcast.listener;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

public class TimerDemo {
	
	public static void main(String[] args) {
		Timer t = new Timer();
		//设置时间
		//指定时间执行一次任务
//		Calendar c = Calendar.getInstance();//java.util.Date好多过时的方法。
//		c.set(2013, 4, 14, 15, 21, 35);
//		t.schedule(new TimerTask() {
//			public void run() {
//				//此处就是要执行的具体任务代码
//				System.out.println("执行了");
//			}
//		}, c.getTime());
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("执行了");
			}
		}, 5*1000, 1000);
	}
}

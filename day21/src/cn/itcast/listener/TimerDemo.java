package cn.itcast.listener;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

public class TimerDemo {
	
	public static void main(String[] args) {
		Timer t = new Timer();
		//����ʱ��
		//ָ��ʱ��ִ��һ������
//		Calendar c = Calendar.getInstance();//java.util.Date�ö��ʱ�ķ�����
//		c.set(2013, 4, 14, 15, 21, 35);
//		t.schedule(new TimerTask() {
//			public void run() {
//				//�˴�����Ҫִ�еľ����������
//				System.out.println("ִ����");
//			}
//		}, c.getTime());
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("ִ����");
			}
		}, 5*1000, 1000);
	}
}

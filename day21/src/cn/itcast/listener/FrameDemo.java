package cn.itcast.listener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {

	public static void main(String[] args) {
		Frame f = new Frame("我的窗体");//事件源
		f.setSize(600, 400);
		f.setVisible(true);
		//注册监听器
//		f.addWindowListener(new WindowListener() {
//			
//			public void windowOpened(WindowEvent e) {
//				
//			}
//			
//			public void windowIconified(WindowEvent e) {
//				
//			}
//			
//			public void windowDeiconified(WindowEvent e) {
//				
//			}
//			
//			public void windowDeactivated(WindowEvent e) {
//				
//			}
//			
//			public void windowClosing(WindowEvent e) {//事件对象一般是作为监听器方法的参数存在的，它封装了发生事件的对象
//				Frame ff = (Frame)e.getSource();
//				ff.dispose();//关闭窗口
//			}
//			
//			public void windowClosed(WindowEvent e) {
//				
//			}
//			
//			public void windowActivated(WindowEvent e) {
//				
//			}
//		});
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				Frame ff = (Frame)e.getSource();
				ff.dispose();//关闭窗口
			}
			
		});
	}

}

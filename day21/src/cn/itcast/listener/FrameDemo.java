package cn.itcast.listener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {

	public static void main(String[] args) {
		Frame f = new Frame("�ҵĴ���");//�¼�Դ
		f.setSize(600, 400);
		f.setVisible(true);
		//ע�������
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
//			public void windowClosing(WindowEvent e) {//�¼�����һ������Ϊ�����������Ĳ������ڵģ�����װ�˷����¼��Ķ���
//				Frame ff = (Frame)e.getSource();
//				ff.dispose();//�رմ���
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
				ff.dispose();//�رմ���
			}
			
		});
	}

}

package cn.itcast.listener;

public class StudentEvent {
	private Object source;

	public StudentEvent(Object source){
		this.source = source;
	}
	public Object getSource() {//��ȡ�¼�Դ
		return source;
	}
	
}

package cn.itcast.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

//�¼�Դ
public class Student implements Serializable,HttpSessionActivationListener,HttpSessionBindingListener{
	private String name;
	private StudentListener listener;
	public Student(String name){//ע�룺ͨ�����췽��
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void eat(){
		if(listener!=null){
			listener.preEat(new StudentEvent(this));
		}
		System.out.println("��ʼ��");
	}
	public void study(){
		if(listener!=null){
			listener.preStudy(new StudentEvent(this));
		}
		System.out.println("��ʼѧ");
	}
	//ע�����
	public void addStudentListener(StudentListener listener){
		this.listener = listener;
	}
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("�Լ�����session���");
	}
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("�Լ�����session�ۻ���");
	}
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("�Լ�������session����");
	}
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("�Լ���session���б��Ƴ���");
	}
}

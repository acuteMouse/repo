package cn.itcast.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

//事件源
public class Student implements Serializable,HttpSessionActivationListener,HttpSessionBindingListener{
	private String name;
	private StudentListener listener;
	public Student(String name){//注入：通过构造方法
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void eat(){
		if(listener!=null){
			listener.preEat(new StudentEvent(this));
		}
		System.out.println("开始吃");
	}
	public void study(){
		if(listener!=null){
			listener.preStudy(new StudentEvent(this));
		}
		System.out.println("开始学");
	}
	//注册监听
	public void addStudentListener(StudentListener listener){
		this.listener = listener;
	}
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("自己随着session活化了");
	}
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("自己随着session钝化了");
	}
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("自己被绑到了session域中");
	}
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("自己从session域中被移除了");
	}
}

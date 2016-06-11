package com.db;

import java.util.LinkedHashMap;
import java.util.Map;

import com.model.Book;

public class Books {
	 private static Map<Integer, Book> books =new LinkedHashMap<Integer, Book>();
	 static {
		 books.put(001, new Book(001, "ISBN001", "��������", "�޹���", 15.00f, "����֮�����Ͼñط֣��־ñغ�"));
		 books.put(002, new Book(002, "ISBN002", "��¥��", "��ѩ��", 25.00f, "�����ѽ����԰"));
		 books.put(003, new Book(003, "ISBN003", "���μ�", "��ж�", 35.00f, "ƶɮ��ȡ���ģ�"));
		 books.put(004, new Book(004, "ISBN004", "ˮ䰴�", "ʩ����", 45.00f, "������ô�ŵĻ���107��"));
	 }
	 public static Map<Integer, Book>findAllBook(){
		 return books;
	 }
	 public static Book findById(int id){
		 return books.get(id);
	 }
}	

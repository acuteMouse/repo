package com.db;

import java.util.LinkedHashMap;
import java.util.Map;

import com.model.Book;

public class Books {
	 private static Map<Integer, Book> books =new LinkedHashMap<Integer, Book>();
	 static {
		 books.put(001, new Book(001, "ISBN001", "三国演义", "罗贯中", 15.00f, "天下之道：合久必分，分久必合"));
		 books.put(002, new Book(002, "ISBN002", "红楼梦", "曹雪芹", 25.00f, "刘姥姥进大观园"));
		 books.put(003, new Book(003, "ISBN003", "西游记", "吴承恩", 35.00f, "贫僧来取经的！"));
		 books.put(004, new Book(004, "ISBN004", "水浒传", "施耐庵", 45.00f, "像我这么屌的还有107个"));
	 }
	 public static Map<Integer, Book>findAllBook(){
		 return books;
	 }
	 public static Book findById(int id){
		 return books.get(id);
	 }
}	

package com.library.model;

import java.sql.Date;






/**
 * 借阅类，对应  借阅表
 * @author Administrator
 *
 */
public class BorrowBook {
		private int id;
		private String userName;	//借书人
		private String bookName;	//借的书名
		private Date borrowDate;	//借书如期
		private Date returnDate;	//还书日期
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
	
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public Date getBorrowDate() {
			return borrowDate;
		}
		public void setBorrowDate(Date borrowDate) {
			this.borrowDate = borrowDate;
		}
		public Date getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(Date returnDate) {
			this.returnDate = returnDate;
		}
	
	
		
}

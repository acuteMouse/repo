package com.library.test;

import java.util.List;

import org.junit.Test;

import com.library.dao.BookDao;
import com.library.dao.BorrowBookDao;
import com.library.dao.UserDao;
import com.library.model.Book;
import com.library.model.BorrowBook;
import com.library.model.User;

public class TestLibrary {
	private static BookDao bd = new BookDao();
	private static UserDao ud =new UserDao();
	private static BorrowBookDao bbd=new BorrowBookDao();
	@Test
	public void testDeleteBook() throws Exception { // ok!
		bd.deleteBook(1);
	}

	@Test
	public void testAdd() throws Exception {
		for (int i = 0; i < 57; i++) {

			Book b = new Book();
			b.setAuthor("fsdf");
			b.setCount(4);
			b.setName("ttt");
			b.setNo(766);
			b.setPublish_company("ddd");
			bd.addBook(b);
		}
	}
	@Test
	public void teasUpdate() throws Exception{
		Book b=new Book();
		b.setAuthor("aaa");
		b.setCount(50);
		b.setId(13);
		b.setName("红楼梦");
		b.setNo(12580);
		b.setPublish_company("人名出版社");
		bd.updateBook(b);
	}
	@Test
	public void testAddUser() throws Exception{
		User u=new User();
		u.setAddress("北京");
		u.setNumber(2005);
		u.setPhone(1359871);
		u.setUserName("赵四");
		ud.addUser(u);
		
	}
		@Test
		public void testFindAll() throws Exception{
		List<BorrowBook> bb=	bbd.findAll();
			System.out.println(bb.get(3).getBorrowDate());;
			System.out.println(bb.get(3).getReturnDate());;
		}
		
}

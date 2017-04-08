package com.inventory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.hibernate.Session;

import com.inventory.entities.Author;
import com.inventory.entities.Book;
import com.inventory.entities.Subject;

public class Application {
	public static void main(String[] args) throws ParseException {
		System.out.println("hello world");

		Session session = HibernateUtilities.getInstance().openSession();
		
		session.beginTransaction();
		
		Author author1 = new Author();
		
		author1.setFirstName("abc");
		author1.setLastName("xyz");
		author1.setAge(20);
		author1.setDob(new SimpleDateFormat("dd/mm/yyyy").parse("04/03/1992"));
		ArrayList<Subject> arr = new ArrayList<>();
		arr.add(new Subject("a"));
		arr.add(new Subject("b"));
		arr.add(new Subject("c"));
		
		author1.setSubjects(arr);
		ArrayList<Book> book = new ArrayList<>();
		book.add(new Book("b1", author1));
		book.add(new Book("b2", author1));
		author1.setBook(book);
		session.save(author1);
		

		
/*		Author author2 = new Author();
		
		author2.setFirstName("def");
		author2.setLastName("xyz");
		author2.setAge(20);
		author2.setDob(new SimpleDateFormat("dd/mm/yyyy").parse("05/03/1992"));
		session.save(author2);
		author2.setAge(author2.getAge()+2);
		
		Author author3 = new Author();
		
		author3.setFirstName("ghi");
		author3.setLastName("xyz");
		author3.setAge(20);
		author3.setDob(new SimpleDateFormat("dd/mm/yyyy").parse("06/03/1992"));
		session.save(author3);
		author3.setAge(author3.getAge()+3);

		Author author4 = new Author();
		
		author4.setFirstName("jkl");
		author4.setLastName("xyz");
		author4.setAge(20);
		author4.setDob(new SimpleDateFormat("dd/mm/yyyy").parse("07/03/1992"));
		session.save(author4);
		author4.setAge(author4.getAge()+4);*/

		session.getTransaction().commit();
		
        session.close();
        
        HibernateUtilities.getInstance().close();
	}
}

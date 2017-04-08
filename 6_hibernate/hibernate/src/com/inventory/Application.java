package com.inventory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.hibernate.Session;

import com.inventory.entities.Author;

public class Application {
	public static void main(String[] args) throws ParseException {
		System.out.println("hello world");

		Session session = HibernateUtilities.getInstance().openSession();
		
		session.beginTransaction();
		
		Author author = new Author();
		
		author.setFirstName("abc");
		author.setLastName("xyz");
		author.setAge(20);
		author.setDob(new SimpleDateFormat("dd/mm/yyyy").parse("04/03/1992"));
		session.save(author);

		session.getTransaction().commit();
		
        session.close();
        
        HibernateUtilities.getInstance().close();
	}
}

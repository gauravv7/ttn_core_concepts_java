package com.inventory;

import org.hibernate.Session;

import com.inventory.entities.Author;

public class Application {
	public static void main(String[] args) {
		System.out.println("hello world");

		Session session = HibernateUtilities.getInstance().openSession();
		
		session.beginTransaction();
		
		Author author = new Author();
		
		author.setFirstName("abc");
		author.setLastName("xyz");
		author.setAge(20);
		session.save(author);
		
		System.out.println(session.get(Author.class, author.getId()));
		
		author.setLastName("def");
		
		session.delete(author);
		
		session.getTransaction().commit();
		
        session.close();
        
        HibernateUtilities.getInstance().close();
	}
}

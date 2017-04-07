package com.inventory;

import org.hibernate.Session;

public class Application {
	public static void main(String[] args) {
		System.out.println("hello world");

		Session session = HibernateUtilities.getInstance().openSession();
        session.close();
	}
}

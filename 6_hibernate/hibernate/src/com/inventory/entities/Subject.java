package com.inventory.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Subject {

	private String subject;

	public Subject() {}
	public Subject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}

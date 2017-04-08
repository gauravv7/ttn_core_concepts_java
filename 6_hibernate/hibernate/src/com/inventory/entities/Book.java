package com.inventory.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author_book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="book_name")
	private String bookName;
	
	@ManyToMany(cascade=CascadeType.ALL)  
	private List<Author> authors;

	public Book() {	}

	public Book(String bookName, List<Author> authors) {
		this.bookName = bookName;
		this.authors = authors;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public List<Author> getAuthor() {
		return authors;
	}

	public void setAuthor(List<Author> author) {
		this.authors = authors;
	}
	

}

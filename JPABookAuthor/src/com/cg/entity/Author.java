package com.cg.entity;

import java.awt.print.Book;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;






@Entity
@Table(name = "Author")
public class Author implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	
	//@Temporal(TemporalType.DATE)	//required for Date and Calendar Types
	//@Column(name = "order_date")
	//private Date purchaseDate;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author", joinColumns = { @JoinColumn(name = "author_id") }, inverseJoinColumns = { @JoinColumn(name = "book_id") })
	private Set<book> books = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<book> getBooks() {
		return books;
	}

	public void setBooks(Set<book> books) {
		this.books = books;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void addBook(book book) {
		this.getBooks().add(book);
	
	}
}	


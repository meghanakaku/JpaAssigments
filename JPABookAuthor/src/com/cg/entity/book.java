package com.cg.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;






@Entity
@Table(name="book_master")
public class book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int isbn;
	
	private String title;
	private int price;
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="books")
	private Set<Author> authors = new HashSet<>();

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}

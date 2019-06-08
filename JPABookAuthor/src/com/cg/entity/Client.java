package com.cg.entity;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;






public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		book elecbook = new book();
		elecbook.setIsbn(1);
		elecbook.setTitle("java");
		elecbook.setPrice(450);

		book elecbook1 = new book();
		elecbook1.setIsbn(2);
		elecbook1.setTitle("oops");
		elecbook1.setPrice(300);

		book elecbook2 = new book();
		elecbook2.setIsbn(3);
		elecbook2.setTitle("c++");
		elecbook2.setPrice(5000);

		book elecbook3 = new book();
		elecbook3.setIsbn(4);
		elecbook3.setTitle("unix");
		elecbook3.setPrice(40000);
		
		
		Author firstAuthor = new Author();
		firstAuthor.setId(1000);
		firstAuthor.setName("meghana");
		
		
		
		firstAuthor.addBook(elecbook);
		firstAuthor.addBook(elecbook1);
		firstAuthor.addBook(elecbook2);
		
		
		
		
		
		Author SecondAuthor = new Author();
		SecondAuthor.setId(1001);
		SecondAuthor.setName("kaku");

		SecondAuthor.addBook(elecbook);
		SecondAuthor.addBook(elecbook1);
		SecondAuthor.addBook(elecbook2);
		
		
		em.persist(firstAuthor);
		em.persist(SecondAuthor);
		
		System.out.println("Added authors along with book details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}

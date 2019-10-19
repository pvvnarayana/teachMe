package com.tm.sb.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String book_id;
	private String title;
	private String author_last_name;
	private String author_first_name;
	private int rating;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor_last_name() {
		return author_last_name;
	}
	public void setAuthor_last_name(String author_last_name) {
		this.author_last_name = author_last_name;
	}
	public String getAuthor_first_name() {
		return author_first_name;
	}
	public void setAuthor_first_name(String author_first_name) {
		this.author_first_name = author_first_name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	
}
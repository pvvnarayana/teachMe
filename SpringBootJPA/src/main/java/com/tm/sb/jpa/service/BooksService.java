package com.tm.sb.jpa.service;

import java.util.List;

import com.tm.sb.jpa.model.Books;

public interface BooksService {

	public void createBook(Books books);
	public List<Books> getBook();
	public Books findById(long id);
	public void deleteBookById(long id);
	
	
}

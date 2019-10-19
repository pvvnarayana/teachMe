package com.tm.sb.jpa.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.sb.jpa.model.Books;
import com.tm.sb.jpa.repository.BooksRepo;
import com.tm.sb.jpa.service.BooksService;

@Service
@Transactional
public class BooksServiceImpl implements BooksService{
	
	@Autowired
	BooksRepo booksRepo;

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void createBook(Books book) {
		booksRepo.save(book);
	}

	@Override
	public List<Books> getBook() {
		return (List<Books>)booksRepo.findAll();
	}

	@Override
	public Books findById(long id) {
		return booksRepo.findById(id).get();
	}

	


	@Override
	public void deleteBookById(long id) {
			booksRepo.deleteById(id);
		
	}

}

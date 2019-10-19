package com.tm.sb.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tm.sb.jpa.model.Books;

@Repository
public interface BooksRepo extends JpaRepository<Books, Long> {

//	public Product findByCode(long code);
}

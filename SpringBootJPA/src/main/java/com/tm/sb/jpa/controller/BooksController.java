package com.tm.sb.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.sb.jpa.model.Books;
import com.tm.sb.jpa.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	BooksService booksService;
	
	@GetMapping("/id/{id}")
	public Books getProductById(@PathVariable Long id) {
		return booksService.findById(id);
	}
	
	
	@GetMapping("/all")
	public List<Books> getAllProducts(){
		return booksService.getBook();
	}

	@PostMapping("/create")
	public String createBooks(@RequestBody Books book) {
		booksService.createBook(book);
		return "Product Created";
	}
	
	@DeleteMapping("/{id}")
	public String deleteBookById(@PathVariable long id) {
		booksService.deleteBookById(id);
		return "Book Deleted";
	}
	
	
}

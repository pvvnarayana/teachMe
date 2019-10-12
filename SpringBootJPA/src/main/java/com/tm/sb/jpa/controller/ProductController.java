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

import com.tm.sb.jpa.model.Product;
import com.tm.sb.jpa.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/id/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.findById(id);
	}
	
	@GetMapping("/code/{code}")
	public Product getProductByCode(@PathVariable Long code) {
		return productService.findByCode(code);
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return productService.getProduct();
	}

	@PostMapping("/create")
	public String createProduct(@RequestBody Product product) {
		productService.createProduct(product);
		return "Product Created";
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable long id) {
		productService.deleteProductById(id);
		return "Product Deleted";
	}
	
	
}

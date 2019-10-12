package com.tm.sb.jpa.service;

import java.util.List;

import com.tm.sb.jpa.model.Product;

public interface ProductService {

	public void createProduct(Product product);
	public List<Product> getProduct();
	public Product findById(long id);
	public Product findByCode(long id);
	public void deleteProductById(long id);
	
	
}

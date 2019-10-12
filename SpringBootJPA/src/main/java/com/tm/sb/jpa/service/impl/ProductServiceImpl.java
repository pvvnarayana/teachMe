package com.tm.sb.jpa.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.sb.jpa.model.Product;
import com.tm.sb.jpa.repository.ProductRepo;
import com.tm.sb.jpa.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepo productRepo;

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void createProduct(Product product) {
		productRepo.save(product);
	}

	@Override
	public List<Product> getProduct() {
		return (List<Product>)productRepo.findAll();
	}

	@Override
	public Product findById(long id) {
		return productRepo.findById(id).get();
	}

	@Override
	public void deleteProductById(long id) {
		productRepo.deleteById(id);
	}

	@Override
	public Product findByCode(long code) {
		return entityManager.createQuery("select p from Product p where p.code="+code, Product.class ).getSingleResult();
	}

}

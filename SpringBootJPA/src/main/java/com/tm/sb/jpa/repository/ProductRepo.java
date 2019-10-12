package com.tm.sb.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tm.sb.jpa.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

//	public Product findByCode(long code);
}

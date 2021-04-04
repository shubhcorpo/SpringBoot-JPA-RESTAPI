package com.shubham.Sbapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubham.Sbapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

	

	//Product save(Product product);

	
}

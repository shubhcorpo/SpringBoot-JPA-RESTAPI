package com.shubham.Sbapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.shubham.Sbapp.entity.Product;
import com.shubham.Sbapp.repository.ProductRepository;



@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	
	//post one product
	public Product saveProduct(Product product) {
		
		return repository.save(product);
	}
	
	//postmanyproducts
	
	public List<Product> saveProducts(List<Product> products){
		
		return repository.saveAll(products);
	}
	
	
	
	 
	  //getbyid
	  
	  public Product getProductById(int id){
		  
		  return repository.findById(id).orElse(null);
	 
	  }
	  
	  //getAll products
	  
	  public List<Product> getProducts(){
		  
		  return repository.findAll();
		  
	  }
	  
	  
	  //getproductbyname
	  
	  public Product getProductByName(String name) {
		  return repository.findByName(name);
		  
	  }
	  
	  //delete
	  
	  public String deleteProduct(int id) {
		  
		  repository.deleteById(id);
		  
		  return "product is safely reomoved";
	  }
	  // put method
	  
	  public Product updateProduct(Product product) {
		  Product existingProduct=repository.findById(product.getId()).orElse(null);
		  
		  existingProduct.setName(product.getName());
		  existingProduct.setQunatity(product.getQunatity());
		  existingProduct.setPrice(product.getPrice());
		  return repository.save(product);
		  
	  }
}

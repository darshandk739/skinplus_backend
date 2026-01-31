package com.skinplus.App.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import com.skinplus.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skinplus.App.*;
import com.skinplus.App.Repository.ProductRepository;

@Service
public class ProductService {

	  @Autowired
	    private ProductRepository productRepository;

	    // CREATE
	    public Product saveProduct(Product product) {
	        return productRepository.save(product);
	    }



	    public Product getProductById(int productId) {
	        return productRepository.findById(productId)
	                .orElseThrow(() ->
	                    new ProductNotFoundException("Product not found with id: " + productId));
	    }

	    // READ ALL
	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    // UPDATE
	    public Product updateProduct(int productId, Product product) {

	        Product existingProduct = getProductById(productId);

	        existingProduct.setProductName(product.getProductName());
	        existingProduct.setProductPrice(product.getProductPrice());

	        return productRepository.save(existingProduct);
	    }

	    // DELETE
	    public void deleteProduct(int productId) {
	        productRepository.deleteById(productId);
	    }
	
	

}
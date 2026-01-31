package com.skinplus.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skinplus.App.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

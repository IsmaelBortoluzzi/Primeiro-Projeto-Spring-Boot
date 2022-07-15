package com.cursojava.cursojava.repositories;

import com.cursojava.cursojava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}

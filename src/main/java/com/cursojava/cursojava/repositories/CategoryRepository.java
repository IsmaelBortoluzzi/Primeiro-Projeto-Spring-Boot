package com.cursojava.cursojava.repositories;

import com.cursojava.cursojava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}

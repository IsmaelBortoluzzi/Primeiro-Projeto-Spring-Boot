package com.cursojava.cursojava.repositories;

import com.cursojava.cursojava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.cursojava.cursojava.repositories;

import com.cursojava.cursojava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

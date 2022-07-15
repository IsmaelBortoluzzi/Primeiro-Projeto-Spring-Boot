package com.cursojava.cursojava.services;

import com.cursojava.cursojava.entities.Order;
import com.cursojava.cursojava.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository userRepository) {
        this.repository = userRepository;
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.orElse(null);
    }

}

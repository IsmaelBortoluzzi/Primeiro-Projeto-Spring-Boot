package com.cursojava.cursojava.repositories;

import com.cursojava.cursojava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}

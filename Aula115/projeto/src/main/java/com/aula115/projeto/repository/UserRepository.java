package com.aula115.projeto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula115.projeto.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

}


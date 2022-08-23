package com.aula115.projeto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula115.projeto.models.ERole;
import com.aula115.projeto.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

    Optional<Role> findByName(ERole name);

}

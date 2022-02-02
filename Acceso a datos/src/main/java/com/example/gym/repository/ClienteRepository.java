package com.example.gym.repository;

import com.example.gym.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

    Set<Cliente> findAll();
    Optional<Cliente> findByDni(String dni);
}

package com.example.gym.repository;

import com.example.gym.domain.Clase;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;
import java.util.Set;

public interface ClaseRepository extends CrudRepository<Clase, String> {

    Set<Clase> findAll();
    Optional<Clase> findByClases(String nombre);

}

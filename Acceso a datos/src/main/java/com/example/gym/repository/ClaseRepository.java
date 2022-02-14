package com.example.gym.repository;

import com.example.gym.domain.Clase;
import org.springframework.data.repository.CrudRepository;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ClaseRepository extends CrudRepository<Clase, String> {

    Set<Clase> findAll();
    Optional<Clase> findById(int id);
    void deleteById(int id);
    Optional<Clase> findByNombre(String nombre);
    Set<Clase> findByFecha(String fecha);

}

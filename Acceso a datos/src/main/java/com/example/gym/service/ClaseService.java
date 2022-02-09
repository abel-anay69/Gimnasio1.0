package com.example.gym.service;

import com.example.gym.domain.Clase;

import java.util.Optional;
import java.util.Set;

public interface ClaseService {

    Set<Clase> findAll();
    Optional<Clase> findById(int id);
    Optional<Clase> findByNombre(String nombre);
    Clase addClase(Clase clase);
    Clase modifyClase(int id, Clase newClase);
    void deleteClase(int id);
}

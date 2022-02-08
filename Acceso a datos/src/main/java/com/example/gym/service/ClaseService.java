package com.example.gym.service;

import com.example.gym.domain.Clase;

import java.util.Optional;
import java.util.Set;

public interface ClaseService {
    Set<Clase> findAll();
    Optional<Clase> findByClases(String nombre);
    Clase addClase(Clase clase);
    Clase modifyClase(String nombre, Clase newClase);
    void deleteClase(String nombre);
}

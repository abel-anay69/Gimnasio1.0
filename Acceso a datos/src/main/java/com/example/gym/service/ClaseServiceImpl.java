package com.example.gym.service;


import com.example.gym.domain.Clase;
import com.example.gym.exception.ClaseNotFoundException;
import com.example.gym.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class ClaseServiceImpl implements ClaseService {
    @Autowired
    private ClaseRepository claseRepository;

    @Override
    public Set<Clase> findAll() {
        return claseRepository.findAll();
    }

    @Override
    public Optional<Clase> findByClases(String nombre) {
        return claseRepository.findByClases(nombre);
    }

    @Override
    public Clase addClase(Clase clase) {
        return claseRepository.save(clase);
    }

    @Override
    public Clase modifyClase(String nombre, Clase newClase) {
        Clase clase = claseRepository.findByClases(nombre)
                .orElseThrow(() -> new ClaseNotFoundException(nombre));
        newClase.setNombre(clase.getNombre());
        return claseRepository.save(newClase);
    }

    @Override
    public void deleteClase(String nombre) {
        claseRepository.findByClases(nombre)
                .orElseThrow(()-> new ClaseNotFoundException(nombre));
        claseRepository.deleteById(nombre);
    }
    }


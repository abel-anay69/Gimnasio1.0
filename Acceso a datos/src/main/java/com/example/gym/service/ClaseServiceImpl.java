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
    public Optional<Clase> findById(int id) {
        return Optional.of(claseRepository.findById(id).get());
    }

    @Override
    public Optional<Clase> findByNombre(String nombre) {
        return claseRepository.findByNombre(nombre);
    }

    @Override
    public Clase addClase(Clase clase) {
        return claseRepository.save(clase);
    }

    @Override
    public Clase modifyClase(int id, Clase newClase) {
        Clase clase = claseRepository.findById(id)
                .orElseThrow(() -> new ClaseNotFoundException(id));
        newClase.setId(clase.getId());
        return claseRepository.save(newClase);
    }

    @Override
    public void deleteClase(int id) {
        claseRepository.findById(id)
                .orElseThrow(()-> new ClaseNotFoundException(id));
        claseRepository.deleteById(id);
    }
    }


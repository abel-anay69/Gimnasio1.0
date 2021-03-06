package com.example.gym.service;


import com.example.gym.domain.Clase;
import com.example.gym.exception.ClaseNotFoundException;
import com.example.gym.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

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

    @Override
    public Set<Clase> findByFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Set<Clase> fechas = claseRepository.findAll();
        Set<Clase> fechasDia = new HashSet<>();

            for (Clase cla: fechas) {
                if (cla.getFecha().compareTo(LocalDate.parse(fecha)) == 0){
                    fechasDia.add(cla);
                }
            }

        return fechasDia;

    }

}


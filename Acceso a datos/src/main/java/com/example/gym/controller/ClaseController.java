package com.example.gym.controller;

import com.example.gym.domain.Clase;
import com.example.gym.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ClaseController{
    @Autowired
    private ClaseService claseService;

    @PostMapping("/clases")
    public ResponseEntity<Clase> addClase(@RequestBody Clase clase){
        Clase addedClase = claseService.addClase(clase);
        return new ResponseEntity<>(addedClase, HttpStatus.OK);
    }

}
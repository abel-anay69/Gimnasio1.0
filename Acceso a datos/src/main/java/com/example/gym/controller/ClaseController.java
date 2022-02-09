package com.example.gym.controller;

import com.example.gym.domain.Clase;
import com.example.gym.service.ClaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@Tag(name = "Clases", description = "Catálogo de clases")

public class ClaseController{
    @Autowired
    private ClaseService claseService;

    @Operation(summary = "Obtiene el listado de clases")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de clases",
                    content = @Content(array = @ArraySchema(schema =
                    @Schema(implementation = Clase.class)))),
    })

   @GetMapping(value ="/ClasesList", produces = "application/json")
    public ResponseEntity<Set<Clase>> getClasesList(@RequestParam(value =
            "clase", defaultValue = "") String nombre) {
        Set<Clase> clases = null;
        Optional<Clase> clase = null;
        if (nombre.equals(""))
            clases = claseService.findAll();
        else
            clase = claseService.findByClases(nombre);
        return new ResponseEntity<>(clases, HttpStatus.OK);
    }


    @Operation(summary = "Registra una nuevo clase")
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "Se registra la clase", content = @Content(schema = @Schema(implementation = Clase.class)))
    })

    @PostMapping("/clases")
    public ResponseEntity<Clase> addClase(@RequestBody Clase clase){
        Clase addedClase = claseService.addClase(clase);
        return new ResponseEntity<>(addedClase, HttpStatus.OK);
    }

}
package com.example.gym.controller;

import com.example.gym.domain.Clase;
import com.example.gym.exception.ClaseNotFoundException;
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

    @GetMapping(value ="/clase", produces = "application/json")
    public ResponseEntity<Set<Clase>> getClasesList(@RequestParam(value =
            "clase", defaultValue = "") String nombre) {
        Set<Clase> clases = null;
        Optional<Clase> clase = null;
        if (nombre.equals(""))
            clases = claseService.findAll();
            //List<Clase> clase1 = claseService.findByClase_Fecha();
        else
            clase = claseService.findByNombre(nombre);
        return new ResponseEntity<>(clases, HttpStatus.OK);
    }

    @GetMapping("/clase/{id}")
    public ResponseEntity<Clase> getClase(@PathVariable int id) {
        Clase clase = claseService.findById(id)
                .orElseThrow(() -> new ClaseNotFoundException(id));
        return new ResponseEntity<>(clase, HttpStatus.OK);
    }

    @GetMapping("/clase/fechaClase/{fecha}")
    public ResponseEntity<Set<Clase>> getClase(@PathVariable String fecha) {
        Set<Clase> clase = claseService.findByFecha(fecha);
        return new ResponseEntity<>(clase, HttpStatus.OK);
    }

    @Operation(summary = "Registra una nuevo clase")
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "Se registra la clase", content = @Content(schema = @Schema(implementation = Clase.class)))
    })

    @PostMapping("/clase")
    public ResponseEntity<Clase> addClase(@RequestBody Clase clase){
        Clase addedClase = claseService.addClase(clase);
        return new ResponseEntity<>(addedClase, HttpStatus.OK);
    }

    @PutMapping(value ="/clase/{id}", produces = "application/json", consumes =  "application/json")
    public ResponseEntity<Clase> modifyClase(@PathVariable int id,
                                                  @RequestBody Clase newClase) {
        Clase clase = claseService.modifyClase(id, newClase);
        return new ResponseEntity<>(clase, HttpStatus.OK);
    }

    @DeleteMapping(value ="/clase/{id}", produces = "application/json")
    public void deleteClase(@PathVariable int id)
    {
        claseService.deleteClase(id);
    }
}
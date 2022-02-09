package com.example.gym.controller;


import com.example.gym.domain.Reserva;
import com.example.gym.domain.Reserva;
import com.example.gym.exception.ReservaNotFoundException;
import com.example.gym.service.ReservaService;
import io.swagger.v3.oas.annotations.Operation;
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
@Tag(name = "Reservas", description = "Catálogo de reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    //HAy que hacer @Operciotn y todo eso de apiresponse

    @GetMapping(value ="/reserva", produces = "application/json")
    public ResponseEntity<Set<Reserva>> getClasesList() {
        Set<Reserva> reservas = null;
        reservas = reservaService.findAll();
        return new ResponseEntity<>(reservas, HttpStatus.OK);
    }


    @Operation(summary = "Obtiene una reserva determinado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe la reserva", content = @Content(schema = @Schema(implementation =
                    Reserva.class))),
            @ApiResponse(responseCode = "404", description = "La reserva no existe", content = @Content(schema = @Schema(implementation =
                    Response.class)))
    })

    @GetMapping("/reserva/{id}")
    public ResponseEntity<Reserva> getReservas(@PathVariable int id) {
        Reserva reserva = reservaService.findById(id)
                .orElseThrow(() -> new ReservaNotFoundException(id));
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }

    @Operation(summary = "Registra una nueva reserva")
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "Se registra la reserva", content = @Content(schema = @Schema(implementation =
                    Reserva.class)))
    })

    @PostMapping(value = "/reserva")
    public ResponseEntity<Reserva> addReserva(@RequestBody Reserva reserva) {
        Reserva addedReserva = reservaService.addReserva(reserva);
        return new ResponseEntity<>(addedReserva, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una reserva en la lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica una reserva", content = @Content(schema = @Schema(implementation =
                    Reserva.class))),
            @ApiResponse(responseCode = "404", description = "La reserva no existe", content = @Content(schema = @Schema(implementation =
                    Response.class)))
    })

    @PutMapping(value ="/reserva/{id}", produces = "application/json", consumes =  "application/json")
    public ResponseEntity<Reserva> modifyReserva(@PathVariable long id,
                                                @RequestBody Reserva newReserva) {
        Reserva reserva = reservaService.modifyReserva(id, newReserva);
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }


    @Operation(summary = "Elimina un vuelo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se elimina la reserva", content = @Content(schema = @Schema(implementation =
                    Response.class))),
            @ApiResponse(responseCode = "404", description = "La reserva no existe", content = @Content(schema = @Schema(implementation =
                    Response.class)))
    })

    @DeleteMapping(value ="/reserva/{id}", produces = "application/json")
    public void deleteReservas(@PathVariable int id)
    {
        reservaService.deleteReserva(id);
    }
}

package com.example.gym.controller;


import com.example.gym.domain.Reserva;
import com.example.gym.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @PostMapping("/reservas")
    public ResponseEntity<Reserva> addReserva(@RequestBody Reserva reserva) {
        Reserva addedReserva = reservaService.addReserva(reserva);
        return new ResponseEntity<>(addedReserva, HttpStatus.OK);
    }
}

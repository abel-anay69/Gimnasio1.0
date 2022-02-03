package com.example.gym.service;

import com.example.gym.domain.Cliente;
import com.example.gym.domain.Reserva;

import java.util.Optional;
import java.util.Set;

public interface ReservaService {
    Set<Reserva> findAll();
    Optional<Reserva> findByCodigo(int codReserva);
    Reserva addReserva(Reserva reserva);
    Reserva modifyReserva(int codReserva, Reserva newReserva);
    void deleteReserva(int codReserva);
}

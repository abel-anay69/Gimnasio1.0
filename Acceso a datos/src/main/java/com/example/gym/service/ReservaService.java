package com.example.gym.service;

import com.example.gym.domain.Reserva;

import java.util.Optional;
import java.util.Set;

public interface ReservaService {
    Set<Reserva> findAll();
    Optional<Reserva> findById(int id);
    Reserva addReserva(Reserva reserva);
    Reserva modifyReserva(long id, Reserva newReserva);
    void deleteReserva(long id);
}

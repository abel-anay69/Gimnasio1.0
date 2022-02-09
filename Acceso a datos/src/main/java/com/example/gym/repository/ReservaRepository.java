package com.example.gym.repository;

import com.example.gym.domain.Reserva;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface ReservaRepository extends CrudRepository<Reserva, String> {

    Set<Reserva> findAll();
    Optional<Reserva> findByCodigo(int codReserva);
    Reserva modifyReserva(int codReserva, Reserva newReserva);
    void deleteReserva(int codReserva);
}

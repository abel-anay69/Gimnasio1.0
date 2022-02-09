package com.example.gym.repository;

import com.example.gym.domain.Reserva;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface ReservaRepository extends CrudRepository<Reserva, String> {

    Set<Reserva> findAll();

    Optional<Reserva> findById(long id);

    void deleteById(int id);
}

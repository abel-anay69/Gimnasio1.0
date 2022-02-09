package com.example.gym.service;

import com.example.gym.domain.Reserva;
import com.example.gym.exception.ReservaNotFoundException;
import com.example.gym.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public Set<Reserva> findAll() {return reservaRepository.findAll();
    }

    @Override
    public Optional<Reserva> findById(int id) {
        return reservaRepository.findById(id);
    }

    @Override
    public Reserva addReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva modifyReserva(int id, Reserva newReserva) {
        Reserva reserva = reservaRepository.findById(id)
                .orElseThrow(() -> new ReservaNotFoundException(id));
        newReserva.setId(reserva.getId());
        return reservaRepository.save(newReserva);
    }

    @Override
    public void deleteReserva(int id) {
        reservaRepository.findById(id)
                .orElseThrow(() -> new ReservaNotFoundException(id));
        reservaRepository.deleteById(id);
    }
}
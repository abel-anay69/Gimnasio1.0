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
    public Optional<Reserva> findByCodigo(int codReserva) {
        return reservaRepository.findByCodigo(codReserva);
    }

    @Override
    public Reserva addReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva modifyReserva(int codReserva, Reserva newReserva) {
        Reserva reserva = reservaRepository.findByCodigo(codReserva)
                .orElseThrow(() -> new ReservaNotFoundException(codReserva));
        newReserva.setCodReserva(reserva.getCodReserva());
        return reservaRepository.save(newReserva);
    }

    @Override
    public void deleteReserva(int codReserva) {
        reservaRepository.findByCodigo(codReserva)
                .orElseThrow(() -> new ReservaNotFoundException(codReserva));
        reservaRepository.deleteByCodReserva(codReserva);
    }
}
package com.example.gym.service;

import com.example.gym.domain.Cliente;
import com.example.gym.controller.ClienteController;
import java.util.Optional;
import java.util.Set;

public interface ClienteService {

    Set<Cliente> findAll();
    Optional<Cliente> findByDni(String dni);
    Cliente meteCliente(Cliente cliente);
    Cliente modifyCliente(String dni, Cliente newCliente);
    void deleteCliente(String dni);
}

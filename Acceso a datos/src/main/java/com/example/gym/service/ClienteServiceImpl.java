package com.example.gym.service;

import com.example.gym.domain.Cliente;
import com.example.gym.repository.ClienteRepository;
import com.example.gym.exception.ClienteNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Set<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findByDni(String dni) {
        return Optional.of(clienteRepository.findByDni(dni).get());
    }

    @Override
    public Cliente meteCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente modifyCliente(String dni, Cliente newCliente) {
        Cliente cliente = clienteRepository.findByDni(dni)
                .orElseThrow(() -> new ClienteNotFoundException(dni));
        newCliente.setDni(cliente.getDni());
        return clienteRepository.save(newCliente);
    }

    @Override
    public void deleteCliente(String dni) {
        clienteRepository.findByDni(dni)
                .orElseThrow(()-> new ClienteNotFoundException(dni));
        clienteRepository.deleteById(dni);
    }
}

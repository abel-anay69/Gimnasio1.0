package com.example.gym.controller;

import com.example.gym.domain.Cliente;
import com.example.gym.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/products")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente) {
        Cliente addedProduct = clienteService.addCliente(cliente);
        return new ResponseEntity<>(addedProduct, HttpStatus.OK);
    }
}

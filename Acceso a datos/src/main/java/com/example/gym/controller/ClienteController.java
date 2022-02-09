package com.example.gym.controller;

import com.example.gym.domain.Cliente;
import com.example.gym.exception.ClienteNotFoundException;
import com.example.gym.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping(value ="/cliente", produces = "application/json")
    public ResponseEntity<Set<Cliente>> getClasesList() {
        Set<Cliente> cliente = null;
        cliente = clienteService.findAll();
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


    @Operation(summary = "Obtiene una clientes determinado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe la clientes", content = @Content(schema = @Schema(implementation =
                    Cliente.class))),
            @ApiResponse(responseCode = "404", description = "La clientes no existe", content = @Content(schema = @Schema(implementation =
                    Response.class)))
    })

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable String dni) {
        Cliente clientes = clienteService.findByDni(dni)
                .orElseThrow(() -> new ClienteNotFoundException(dni));
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @Operation(summary = "Registra una nueva cliente")
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "Se registra la cliente", content = @Content(schema = @Schema(implementation =
                    Cliente.class)))
    })

    @PostMapping(value = "cliente", produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<Cliente> meteCliente(@RequestBody Cliente cliente) {
        Cliente addedCliente = clienteService.meteCliente(cliente);
        return new ResponseEntity<>(addedCliente, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una cliente en la lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica una clientes", content = @Content(schema = @Schema(implementation =
                    Cliente.class))),
            @ApiResponse(responseCode = "404", description = "La clientes no existe", content = @Content(schema = @Schema(implementation =
                    Response.class)))
    })

    @PutMapping(value ="/cliente/{id}", produces = "application/json", consumes =  "application/json")
    public ResponseEntity<Cliente> modifyReserva(@PathVariable String dni,
                                                 @RequestBody Cliente newCliente) {
        Cliente cliente = clienteService.modifyCliente(dni, newCliente);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


    @Operation(summary = "Elimina un vuelo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se elimina la cliente", content = @Content(schema = @Schema(implementation =
                    Response.class))),
            @ApiResponse(responseCode = "404", description = "La cliente no existe", content = @Content(schema = @Schema(implementation =
                    Response.class)))
    })

    @DeleteMapping(value ="/cliente/{id}", produces = "application/json")
    public void deleteCliente(@PathVariable String dni)
    {
        clienteService.deleteCliente(dni);
    }
}

package com.example.gym.exception;

public class ReservaNotFoundException extends RuntimeException{

    public ReservaNotFoundException() {
        super();
    }

    public ReservaNotFoundException(int codReserva) {
        super("Reserva not found: " + codReserva);
    }
}


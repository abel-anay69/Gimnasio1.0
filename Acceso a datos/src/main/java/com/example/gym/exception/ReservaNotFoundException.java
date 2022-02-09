package com.example.gym.exception;

public class ReservaNotFoundException extends RuntimeException{

    public ReservaNotFoundException() {
        super();
    }

    public ReservaNotFoundException(int id) {
        super("Reserva not found: " + id);
    }
}


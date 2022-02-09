package com.example.gym.exception;

public class ReservaNotFoundException extends RuntimeException{

    public ReservaNotFoundException(long id) {
        super();
    }

    public ReservaNotFoundException(int id) {
        super("Reserva not found: " + id);
    }
}


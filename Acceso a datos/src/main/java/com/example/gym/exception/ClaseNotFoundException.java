package com.example.gym.exception;

public class ClaseNotFoundException extends RuntimeException{

    public ClaseNotFoundException() {
        super();
    }

    public ClaseNotFoundException(String nombre) {
        super("Clase not found: " + nombre);
    }
}

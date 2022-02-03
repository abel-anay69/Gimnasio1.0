package com.example.gym.exception;

public class ClaseNotFoundException extends RuntimeException {
    public ClaseNotFoundException() {
        super();
    }
    public ClaseNotFoundException(String message) {
        super(message);
    }
    public ClaseNotFoundException(long id) {
        super("Clase not found: " + id);
    }
}

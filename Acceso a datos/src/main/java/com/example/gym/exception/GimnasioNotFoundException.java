package com.example.gym.exception;

public class GimnasioNotFoundException {

    public GimnasioNotFoundException() {
        super();
    }

    public GimnasioNotFoundException(String message) {
        super(message);
    }

    public GimnasioNotFoundException(long id) {
        super("Gimnasion not found: " +id);
    }
}

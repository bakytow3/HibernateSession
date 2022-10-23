package org.example.exception;

public class BadCredentionalsException extends RuntimeException {
    public BadCredentionalsException() {
    }

    public BadCredentionalsException(String message) {
        super(message);
    }
}

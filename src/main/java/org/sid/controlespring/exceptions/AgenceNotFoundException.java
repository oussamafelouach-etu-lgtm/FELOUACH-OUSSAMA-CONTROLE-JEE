package org.sid.controlespring.exceptions;

public class AgenceNotFoundException extends RuntimeException {
    public AgenceNotFoundException(String message) {
        super(message);
    }
}

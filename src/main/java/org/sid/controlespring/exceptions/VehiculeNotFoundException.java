package org.sid.controlespring.exceptions;

public class VehiculeNotFoundException extends RuntimeException {
    public VehiculeNotFoundException(String message) {
        super(message);
    }
}

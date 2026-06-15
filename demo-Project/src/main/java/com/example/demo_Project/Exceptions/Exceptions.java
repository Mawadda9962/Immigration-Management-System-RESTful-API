package com.example.demo_Project.Exceptions;

import org.springframework.http.HttpStatus;

public class Exceptions extends RuntimeException{
    private final HttpStatus status;

    // Constructor 1: default to INTERNAL_SERVER_ERROR
    public Exceptions(String message) {
        super(message);
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    // Constructor 2: custom status
    public Exceptions(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    // Static factory: 404 Not Found
    public static Exceptions notFound(String entity) {
        return new Exceptions(HttpStatus.NOT_FOUND, entity + " not found");
    }

    // Static factory: 400 Bad Request
    public static Exceptions badRequest(String message) {
        return new Exceptions(HttpStatus.BAD_REQUEST, message);
    }

    public HttpStatus getStatus() { return status; }


}

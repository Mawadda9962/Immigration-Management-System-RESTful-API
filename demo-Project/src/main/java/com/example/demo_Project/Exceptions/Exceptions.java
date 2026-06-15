package com.example.demo_Project.Exceptions;

import org.springframework.http.HttpStatus;

public class Exceptions extends RuntimeException {
    private HttpStatus status;

    public Exceptions(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public static Exceptions notFound(String message) {
        return new Exceptions(HttpStatus.NOT_FOUND, message);
    }

    public static Exceptions badRequest(String message) {
        return new Exceptions(HttpStatus.BAD_REQUEST, message);
    }

    public HttpStatus getStatus() {
        return status;
    }
}

package com.example.Tour.Package.exceptions;

public class TourNotFoundException extends RuntimeException {
    public TourNotFoundException(Long id) {
        super("Tour not found with id: " + id);
    }
}

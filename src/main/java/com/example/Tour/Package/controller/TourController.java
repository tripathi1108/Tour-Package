package com.example.Tour.Package.controller;



import com.example.Tour.Package.entity.Tour;
import com.example.Tour.Package.services.TourService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class TourController {
    private final TourService service;

    public TourController(TourService service) {
        this.service = service;
    }

    // Create Tour
    @PostMapping
    public ResponseEntity<Tour> createTour(@Valid @RequestBody Tour tour) {
        return ResponseEntity.ok(service.createTour(tour));
    }

    // Get All Tours
    @GetMapping
    public ResponseEntity<List<Tour>> getAllTours() {
        return ResponseEntity.ok(service.getAllTours());
    }

    // Get Tour By ID
    @GetMapping("/{id}")
    public ResponseEntity<Tour> getTourById(@PathVariable Long id) {
        Tour tour = service.getTourById(id);
        return ResponseEntity.ok(tour);
    }

    // Update Tour
    @PutMapping("/{id}")
    public ResponseEntity<Tour> updateTour(@PathVariable Long id, @Valid @RequestBody Tour tour) {
        Tour updatedTour = service.updateTour(id, tour);
        return ResponseEntity.ok(updatedTour);
    }

    // Delete Tour
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTour(@PathVariable Long id) {
        service.deleteTour(id);
        return ResponseEntity.noContent().build();
    }
}

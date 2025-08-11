package com.example.Tour.Package.services;


import com.example.Tour.Package.entity.*;
import com.example.Tour.Package.repo.*;
import com.example.Tour.Package.exceptions.TourNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    private final TourRepo tourRepo;

    public TourService(TourRepo tourRepo) {
        this.tourRepo = tourRepo;
    }

    public Tour createTour(Tour tour) {
        return tourRepo.save(tour);
    }

    public List<Tour> getAllTours() {
        return tourRepo.findAll();
    }

    public Tour getTourById(Long id) {
        return tourRepo.findById(id)
                .orElseThrow(() -> new TourNotFoundException(id));
    }

    public Tour updateTour(Long id, Tour updatedTour) {
        Tour existingTour = getTourById(id);
        // Update fields
        existingTour.setImage(updatedTour.getImage());
        existingTour.setDiscountInPercentage(updatedTour.getDiscountInPercentage());
        existingTour.setTitle(updatedTour.getTitle());
        existingTour.setDescription(updatedTour.getDescription());
        existingTour.setDuration(updatedTour.getDuration());
        existingTour.setActualPrice(updatedTour.getActualPrice());
        existingTour.setDiscountedPrice(updatedTour.getDiscountedPrice());
        return tourRepo.save(existingTour);
    }

    public void deleteTour(Long id) {
        Tour tour = getTourById(id);
        tourRepo.delete(tour);
    }
}

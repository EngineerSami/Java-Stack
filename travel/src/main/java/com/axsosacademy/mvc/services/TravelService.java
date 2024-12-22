package com.axsosacademy.mvc.services;

import com.axsosacademy.mvc.models.Travel;
import com.axsosacademy.mvc.repositories.TravelRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelService {
    private final TravelRepository TravelRepository;

    public TravelService(TravelRepository TravelRepository) {
        this.TravelRepository = TravelRepository;
    }

    public Optional<Travel> getTravelById(Long id) {
        return TravelRepository.findById(id);
    }

    @Transactional
    public Travel updateTravel(Long id, String expenseName, String vendor, Double amount, String description) {
        Optional<Travel> optionalTravel = TravelRepository.findById(id);
        if (optionalTravel.isPresent()) {
            Travel TravelToUpdate = optionalTravel.get();
            TravelToUpdate.setexpenseName(expenseName);
            TravelToUpdate.setvendor(vendor);
            TravelToUpdate.setamount(amount);
            TravelToUpdate.setDescription(description); 
            return TravelRepository.save(TravelToUpdate);
        } else {
            return null; 
        }
    }

    public List<Travel> getAllTravels() {
        return TravelRepository.findAll();
    }

    public Travel createTravel(Travel Travel) {
        return TravelRepository.save(Travel);
    }

    public Travel findTravel(Long id) {
        return TravelRepository.findById(id).orElse(null);
    }

    public void deleteTravel(Long id) {
        TravelRepository.deleteById(id);
    }
}
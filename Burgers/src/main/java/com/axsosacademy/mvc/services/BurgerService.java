package com.axsosacademy.mvc.services;

import com.axsosacademy.mvc.models.Burger;
import com.axsosacademy.mvc.repositories.BurgerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BurgerService {
    private final BurgerRepository burgerRepository;

    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }

    public Optional<Burger> getBurgerById(Long id) {
        return burgerRepository.findById(id);
    }

    @Transactional
    public Burger updateBurger(Long id, String burgerName, String restaurantName, Double rating, String description) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if (optionalBurger.isPresent()) {
            Burger burgerToUpdate = optionalBurger.get();
            burgerToUpdate.setBurgerName(burgerName);
            burgerToUpdate.setRestaurantName(restaurantName);
            burgerToUpdate.setRating(rating);
            burgerToUpdate.setDescription(description); 
            return burgerRepository.save(burgerToUpdate);
        } else {
            return null; 
        }
    }

    public List<Burger> getAllBurgers() {
        return burgerRepository.findAll();
    }

    public Burger createBurger(Burger burger) {
        return burgerRepository.save(burger);
    }

    public Burger findBurger(Long id) {
        return burgerRepository.findById(id).orElse(null);
    }

    public void deleteBurger(Long id) {
        burgerRepository.deleteById(id);
    }
}
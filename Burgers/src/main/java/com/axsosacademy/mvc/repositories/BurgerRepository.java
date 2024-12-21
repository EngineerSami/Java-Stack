package com.axsosacademy.mvc.repositories;

import com.axsosacademy.mvc.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {
    @SuppressWarnings("null")
    @Override
    List<Burger> findAll();

    List<Burger> findByRestaurantNameContaining(String search);

    Long countByBurgerNameContaining(String search);

    Long deleteByBurgerNameStartingWith(String search);
}
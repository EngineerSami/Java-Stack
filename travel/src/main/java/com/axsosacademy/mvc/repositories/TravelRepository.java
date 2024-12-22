package com.axsosacademy.mvc.repositories;

import com.axsosacademy.mvc.models.Travel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {
    @SuppressWarnings("null")
    @Override
    List<Travel> findAll();

    List<Travel> findByvendorContaining(String search);

    Long countByexpenseNameContaining(String search);

    Long deleteByexpenseNameStartingWith(String search);
}
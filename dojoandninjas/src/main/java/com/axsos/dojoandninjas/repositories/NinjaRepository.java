package com.axsos.dojoandninjas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.axsos.dojoandninjas.models.Ninja;

import java.util.List;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
    List<Ninja> findByDojoId(Long dojoId); 
}
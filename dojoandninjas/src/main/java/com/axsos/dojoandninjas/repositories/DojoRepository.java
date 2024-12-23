package com.axsos.dojoandninjas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.axsos.dojoandninjas.models.Dojo;

public interface DojoRepository extends JpaRepository<Dojo, Long> {
}
package com.axsos.dojoandninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.axsos.dojoandninjas.models.Ninja;
import com.axsos.dojoandninjas.repositories.NinjaRepository;

import java.util.List;

@Service
public class NinjaServiceImpl implements NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    @Override
    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja); 
    }

    @Override
    public List<Ninja> getAllNinjas() {
        return ninjaRepository.findAll(); 
    }
}
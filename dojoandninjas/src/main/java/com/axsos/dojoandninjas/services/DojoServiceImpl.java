package com.axsos.dojoandninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.models.Ninja;
import com.axsos.dojoandninjas.repositories.DojoRepository;
import com.axsos.dojoandninjas.repositories.NinjaRepository;

import java.util.List;

@Service
public class DojoServiceImpl implements DojoService {

    @Autowired
    private DojoRepository dojoRepository;

    @Autowired
    private NinjaRepository ninjaRepository; 

    @Override
    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }

    @Override
    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }

    @Override
    public Dojo getDojoById(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Ninja> getNinjas(Long dojoId) {
        return ninjaRepository.findByDojoId(dojoId); 
    }
}
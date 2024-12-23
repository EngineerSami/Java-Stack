package com.axsos.dojoandninjas.services;

import java.util.List;
import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.models.Ninja;

public interface DojoService {
    Dojo createDojo(Dojo dojo);
    List<Dojo> getAllDojos();
    Dojo getDojoById(Long id);
    List<Ninja> getNinjas(Long dojoId); 
}
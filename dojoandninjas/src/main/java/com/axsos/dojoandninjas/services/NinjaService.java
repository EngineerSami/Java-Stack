package com.axsos.dojoandninjas.services;

import java.util.List;
import com.axsos.dojoandninjas.models.Ninja;

public interface NinjaService {
    Ninja createNinja(Ninja ninja);

    List<Ninja> getAllNinjas();
}
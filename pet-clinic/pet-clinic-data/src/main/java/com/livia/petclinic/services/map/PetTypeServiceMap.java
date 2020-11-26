package com.livia.petclinic.services.map;

import com.livia.petclinic.model.Pet;
import com.livia.petclinic.model.PetType;
import com.livia.petclinic.services.PetService;
import com.livia.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}

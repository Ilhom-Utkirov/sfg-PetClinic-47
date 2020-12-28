package com.example.demo.service.map;

import com.example.demo.model.Pet;
import com.example.demo.service.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstracMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet  object) {
        super.delete(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

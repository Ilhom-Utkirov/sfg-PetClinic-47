package com.example.demo.service.map;

import com.example.demo.model.Pet;
import com.example.demo.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@Profile({"default","map"})
public class PetMapService extends AbstracMapService<Pet,Long> implements PetService {
    @Override
    public Pet save(Pet pet) {
        //return super.save(pet.getId(),pet);
        return super.save(pet);
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

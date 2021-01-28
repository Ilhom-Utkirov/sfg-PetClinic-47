package com.example.demo.service.map;

import com.example.demo.model.PetType;
import com.example.demo.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstracMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

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
    public PetType findById(Long id) {
        return super.findById(id);
    }
}

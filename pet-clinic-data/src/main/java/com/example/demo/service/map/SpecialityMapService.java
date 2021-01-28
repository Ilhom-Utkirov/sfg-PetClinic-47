package com.example.demo.service.map;

import com.example.demo.model.Speciality;
import com.example.demo.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstracMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
            super.delete(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}

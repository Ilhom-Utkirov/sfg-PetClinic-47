package com.example.demo.service.map;

import com.example.demo.model.Owner;
import com.example.demo.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends  AbstracMapService<Owner, Long> implements CrudService<Owner,Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }


    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

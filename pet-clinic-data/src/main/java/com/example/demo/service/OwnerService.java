package com.example.demo.service;

import com.example.demo.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner getByLastName(String lastname);
    Owner getById(Long id);
    Owner saveOwner(Owner owner);
    Set<Owner> findAll();

}

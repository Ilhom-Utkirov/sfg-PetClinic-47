package com.example.demo.service;


import com.example.demo.model.Pet;

import java.util.Set;

public interface PetService {


    Pet getById(Long id);
    Pet savePet(Pet pet);
    Set<Pet> findAll();
}

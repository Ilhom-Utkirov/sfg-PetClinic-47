package com.example.demo.service;


import com.example.demo.model.Vet;

import java.util.Set;

public interface VetService {

    Vet getById(Long id);
    Vet saveOwner(Vet owner);
    Set<Vet> findAll();
}

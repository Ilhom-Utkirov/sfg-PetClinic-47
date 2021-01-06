package com.example.demo.service;

import com.example.demo.model.PetType;
import org.springframework.stereotype.Service;

@Service
public interface PetTypeService extends CrudService<PetType,Long> {
}

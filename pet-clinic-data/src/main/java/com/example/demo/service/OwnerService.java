package com.example.demo.service;

import com.example.demo.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner getByLastName(String lastname);

}

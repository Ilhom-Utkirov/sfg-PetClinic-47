package com.example.demo.service;

import com.example.demo.model.Owner;

//public interface OwnerService extends CrudService<Owner, Long> {
public interface OwnerService extends CrudService<Owner, Long> {

    Owner getByLastName(String lastname);

}

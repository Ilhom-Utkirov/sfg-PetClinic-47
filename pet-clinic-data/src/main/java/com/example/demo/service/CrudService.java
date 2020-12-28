package com.example.demo.service;

import java.util.Set;

public interface CrudService <T, ID>{
    T save(T object);
    Set<T> findAll();
    T findById(ID id);
    void delete(ID id);
    void deleteById(ID id);

}

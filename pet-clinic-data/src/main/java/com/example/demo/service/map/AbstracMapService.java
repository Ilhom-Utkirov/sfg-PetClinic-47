package com.example.demo.service.map;

import com.example.demo.model.BaseEntity;

import java.util.*;

public abstract class AbstracMapService<T extends BaseEntity,ID extends Long> {
//    protected Map<ID, T> map = new HashMap<>();
protected Map<Long, T> map = new HashMap<>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    //T save(ID id,T object){
    T save(T object){

        if (object!=null){
            if (object.getId()==null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null. See Abstract MapService");
        }
        //map.put(id, object );
        return  object;
    }


    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextID = null;

        try {
            nextID = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextID = 1l;
        }
        //return Collections.max(map.keySet())+1;
        return nextID;
    }
}

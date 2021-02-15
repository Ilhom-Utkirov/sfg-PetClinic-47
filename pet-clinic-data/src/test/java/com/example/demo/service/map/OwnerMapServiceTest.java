package com.example.demo.service.map;

import com.example.demo.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class OwnerMapServiceTest {
    OwnerMapService ownerMapServic;

    final long ownerId = 1L;
    @BeforeEach
    void setUp() {

        ownerMapServic = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        ownerMapServic.save(Owner.builder().id(1L).build());
    }

    @Test
    void save() {
        Long id =2L;
        Owner owner2 = Owner.builder().id(id).build();
        Owner savedOwner = ownerMapServic.save(owner2);

        assertEquals(id, savedOwner.getId());

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapServic.findAll();

        assertEquals(1, ownerSet.size());


    }

    @Test
    void findById() {
        Owner owner = ownerMapServic.findById(ownerId);

        assertEquals(ownerId, owner.getId());

    }

    @Test
    void delete() {
        ownerMapServic.delete(ownerMapServic.findById(ownerId));
        assertEquals(0, ownerMapServic.findAll().size());

    }

    @Test
    void deleteById() {
        ownerMapServic.deleteById(ownerId);
        assertEquals(0, ownerMapServic.findAll().size());
    }

    @Test
    void findByLastName() {
        String userName = "Smith";
        Owner owner3 = ownerMapServic.findByLastName(userName);


        assertNotNull(owner3);

        assertEquals(ownerId, owner3.getId());
    }
}
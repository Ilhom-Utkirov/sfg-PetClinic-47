package com.example.demo.bootstrap;

import com.example.demo.model.Owner;
import com.example.demo.model.Pet;
import com.example.demo.model.PetType;
import com.example.demo.model.Vet;
import com.example.demo.service.OwnerService;
import com.example.demo.service.PetTypeService;
import com.example.demo.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        //ownerService = ownerService;
        //
        // vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType Dog = new PetType();
        Dog.setName("Dog");
        //petTypeService.save(Dog);
        PetType savedDogType =petTypeService.save(Dog); //official version


        PetType cat = new PetType();
        cat.setName("Cat");
        //petTypeService.save(Dog);
        PetType savedCatType =petTypeService.save(cat); //official version


        Owner owner1 = new Owner();
       // owner1.setId(1L);
        owner1.setFirstName("Michel");
        owner1.setLastName("Belluchi");
        owner1.setAddress("new Yok");
        owner1.setCity("new york city");
        owner1.setTelephone("123123123");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
    mikesPet.setBirthDate(LocalDate.now());
    mikesPet.setName("rex");
    owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
       // owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glimene");
        owner2.setAddress("Birmingham");
        owner2.setCity("City name");
        owner2.setTelephone("123123344");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatType);
        fionasCat.setOwner(owner1);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("mosh");
        owner2.getPets().add(mikesPet);

        owner2.getPets().add(fionasCat);

















        ownerService.save(owner2);
        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
       // vet1.setId(1L);
        vet1.setFirstName("Axe");
        vet1.setLastName("jakior");

        vetService.save(vet1);

        Vet vet2 = new Vet();
       // vet2.setId(2L);
        vet2.setFirstName("Anna");
        vet2.setLastName("Semenovich");

        vetService.save(vet2);

        System.out.println("Loaded Vets .....");

    }
}

package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "owners")
public class Owner extends Person{

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    //compelety mapping for the owner
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

}

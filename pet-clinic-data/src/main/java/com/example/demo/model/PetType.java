package com.example.demo.model;


import javax.persistence.Column;

public class PetType extends BaseEntity{

    @Column(name ="name")
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}

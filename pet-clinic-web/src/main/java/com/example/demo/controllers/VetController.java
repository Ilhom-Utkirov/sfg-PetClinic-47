package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vet", "/vet/index", "vet/index.html"})
    public String vetList(){
        return "vets/index";
    }

}

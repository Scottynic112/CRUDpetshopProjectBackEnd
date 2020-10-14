package com.company.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.Animal;
import com.company.PetshopRepo;

@RestController ]
@RequestMapping(Value = "/petshop")
public class PetshopController {

    @Autowired
    private PetshopRepo petshopRepo;

    @GetMapping("/getAnimal")
    public List<Animal> finaAll(){
        return todoRepo.findAll();
    }

    @PostMapping("/createAnimal")
    public Animal save(@Valid @NotNull @RequestBody Animal animal){
        return PetshopRepo.save(animal);
    }
}
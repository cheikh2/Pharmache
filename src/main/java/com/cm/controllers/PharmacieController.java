package com.cm.controllers;

import com.cm.entities.Pharmacie;
import com.cm.repository.PharmacieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PharmacieController {

    @Autowired
    private PharmacieRepository pharmacieRepository;

    @GetMapping("/pharmacies")
    public List<Pharmacie> getPharmacies(){
        return pharmacieRepository.findAll();
    }

    @GetMapping("/pharmacie/{id}")
    public Pharmacie getPharmacie(@PathVariable Integer id){
        return pharmacieRepository.getOne(id);
    }

    @DeleteMapping("/pharmacie/{id}")
    public Boolean deletePharmacie(@PathVariable Integer id){
        pharmacieRepository.deleteById(id);
        return true;
    }

    @PostMapping("/pharmacie")
    public Pharmacie createPharmacie(Pharmacie pharmacie){
        return pharmacieRepository.save(pharmacie);
    }

    @PutMapping("/pharmacie/{id}")
    public Pharmacie updatetePharmacie(@PathVariable int id, Pharmacie pharmacie){
        return pharmacieRepository.save(pharmacie);
    }
}

package com.cm;

import com.cm.entities.Pharmacie;
import com.cm.repository.PharmacieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnApplication implements CommandLineRunner {

    @Autowired
    private PharmacieRepository pharmacieRepository;

    public static void main(String[] args) {
        SpringApplication.run(SnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        pharmacieRepository.save(new Pharmacie("Lora","Pikine", "Dakar", 1));
        pharmacieRepository.save(new Pharmacie("Loum","Diamaguene", "Thiesr", 1));
    }
}

package com.example.reference.buku;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bukuConfig {

    @Bean
    CommandLineRunner commandLineRunner(BukuRepository bukuRepository) {
        return args -> {
            Buku buku1 = new Buku("Pemrograman Algoritma", "Dadang", "Sinar Mars");
            Buku buku2 = new Buku("Arsitektur Komputer", "Udin", "Sinar Mars");

            bukuRepository.saveAll(List.of(buku1, buku2));
        };
    }
}

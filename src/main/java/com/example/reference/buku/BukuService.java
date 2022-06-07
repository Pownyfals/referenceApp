package com.example.reference.buku;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BukuService {

    private final BukuRepository bukuRepository;

    @Autowired
    public BukuService(BukuRepository bukuRepository) {
        this.bukuRepository = bukuRepository;
    }

    public List<Buku> getBuku() {
        return bukuRepository.findAll();
    }

    public void addNewBuku(Buku buku) {
        // Optional<Buku> bukuOptional =
        // bukuRepository.findBukuByJudul(buku.getJudul());
        // if (bukuOptional.isPresent()) {
        // throw new IllegalStateException("Email Taken");
        // }
        bukuRepository.save(buku);
    }

}

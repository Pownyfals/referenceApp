package com.example.reference.buku;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BukuRepository extends JpaRepository<Buku, Long> {

    // @Query("SELECT s FROM buku s WHERE s.judul =?1")
    Optional<Buku> findBukuByJudul(String buku);

    void save(Optional<Buku> bukuOptional);

}

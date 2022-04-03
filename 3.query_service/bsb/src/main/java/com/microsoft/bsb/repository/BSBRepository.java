package com.microsoft.bsb.repository;

import com.microsoft.bsb.model.BSB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BSBRepository extends JpaRepository<BSB, String> {
    @Query(
            value = "SELECT * FROM bsb b",
            nativeQuery = true)
    List<BSB> getAll();
}
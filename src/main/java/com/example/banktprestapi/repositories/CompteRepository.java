package com.example.banktprestapi.repositories;

import com.example.banktprestapi.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
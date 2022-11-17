package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.Client;
import com.example.gestionmagasinstock.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}

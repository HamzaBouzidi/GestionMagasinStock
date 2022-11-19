package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}

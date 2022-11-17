package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.Client;
import com.example.gestionmagasinstock.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}

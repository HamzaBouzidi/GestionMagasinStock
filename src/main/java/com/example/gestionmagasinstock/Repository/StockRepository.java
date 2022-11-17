package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.Client;
import com.example.gestionmagasinstock.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}

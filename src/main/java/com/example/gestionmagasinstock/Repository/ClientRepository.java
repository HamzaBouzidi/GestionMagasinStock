package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.CategorieClient;
import com.example.gestionmagasinstock.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> getClientsByCategorieClient(CategorieClient categorieClient);

}

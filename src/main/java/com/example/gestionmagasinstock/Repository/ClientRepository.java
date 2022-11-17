package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {


}

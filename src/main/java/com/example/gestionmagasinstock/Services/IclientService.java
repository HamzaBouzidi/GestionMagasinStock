package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Client;

import java.util.List;

public interface IclientService {

    List<Client> retrieveAllClients();

    Client addClient(Client c);

    void deleteClient(Long id);

    Client updateClient(Client c);

    Client retrieveClient(Long id);
}

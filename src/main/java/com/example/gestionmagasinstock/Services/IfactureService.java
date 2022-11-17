package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Facture;

import java.util.List;

public interface IfactureService {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
}

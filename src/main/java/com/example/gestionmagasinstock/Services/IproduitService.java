package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Produit;

import java.util.List;

public interface IproduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);
}

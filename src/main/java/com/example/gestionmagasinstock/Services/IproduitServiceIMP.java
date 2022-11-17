package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Produit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IproduitServiceIMP implements  IproduitService{
    @Override
    public List<Produit> retrieveAllProduits() {
        return null;
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return null;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return null;
    }
}

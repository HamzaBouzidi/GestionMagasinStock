package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Fournisseur;
import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Entities.Rayon;
import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Repository.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IproduitServiceIMP implements  IproduitService{

    @Autowired
    RayonRepository RayonRepository;

    @Autowired
    StockRepository StockRepository;

    @Autowired
    ProduitRepository ProduitRepository;

    @Autowired
    FournisseurRepository FournisseurRepository;



    @Override
    public List<Produit> retrieveAllProduits() {
        return ProduitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {

        Rayon rayon = RayonRepository.findById(idRayon).orElse(null);
        Stock stock = StockRepository.findById(idStock).orElse(null);

        p.setRayon(rayon);
        p.setStock(stock);

        ProduitRepository.save(p);

        return p;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return ProduitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p = ProduitRepository.findById(idProduit).orElse(null);
        Stock s = StockRepository.findById(idStock).orElse(null);
        if(p != null && s != null){
            p.setStock(s);
            ProduitRepository.save(p);
        }
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur f = FournisseurRepository.findById(fournisseurId).orElse(null);
        Produit p = ProduitRepository.findById(produitId).orElse(null);
        if(f != null && p != null){
            p.getFournisseurs().add(f);
            ProduitRepository.save(p);
        }
    }
}

package com.example.gestionmagasinstock.Services;
import com.example.gestionmagasinstock.Repository.FactureRepository;
import com.example.gestionmagasinstock.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionmagasinstock.Entities.Client;
import com.example.gestionmagasinstock.Entities.Facture;
import com.example.gestionmagasinstock.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IfactureServiceIMP  implements IfactureService{

    @Autowired
    ProduitRepository ProduitRepository;

    @Autowired
    FactureRepository FactureRepository;
    @Autowired
    ClientRepository ClientRepository;
    @Override
    public List<Facture> retrieveAllFactures() {
        return FactureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        FactureRepository.deleteById(id);

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return FactureRepository.findById(id).orElse(null);
    }


    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        Client c = ClientRepository.findById(idClient).orElse(null);
        if(c != null){
            return (List<Facture>) c.getFactures();
        }
        return null;
    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client = ClientRepository.findById(idClient).orElse(null);
        if(client != null)
            f.setClient(client);
        return null;
    }

}

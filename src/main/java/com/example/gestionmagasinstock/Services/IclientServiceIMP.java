package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.CategorieClient;
import com.example.gestionmagasinstock.Entities.Client;
import com.example.gestionmagasinstock.Entities.Facture;
import com.example.gestionmagasinstock.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class IclientServiceIMP implements IclientService {


    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);

    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById((Long) id).orElse(null);
    }


    @Override
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate) {
        List<Client> list = clientRepository.getClientsByCategorieClient(categorieClient);
        float somme = 0;
        for (Client c : list)
            somme += sommeFacturesParDate(c, startDate, endDate);
        return somme;
    }


    private float sommeFacturesParDate(Client client, Date startDate, Date endDate)
    {
        float somme = (float) client.getFactures().stream()
                .filter(facture ->  facture.isActive() == false &&
                        facture.getDateFacture().after(startDate)  &&
                        facture.getDateFacture().before(endDate))
                .collect(Collectors.summarizingDouble(Facture::getMontantFacture))
                .getSum();
        return somme;
    }
}

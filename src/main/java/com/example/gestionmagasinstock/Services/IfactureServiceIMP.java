package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Facture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IfactureServiceIMP  implements IfactureService{
    @Override
    public List<Facture> retrieveAllFactures() {
        return null;
    }

    @Override
    public void cancelFacture(Long id) {

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return null;
    }



}

package com.example.gestionmagasinstock.Controllers;


import com.example.gestionmagasinstock.Entities.Facture;
import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Services.IfactureService;
import com.example.gestionmagasinstock.Services.IproduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("facture")

public class FactureRestController {

    @Autowired
    IfactureService ifactureService;



    @GetMapping("RetieveAllFacture")
    public List<Facture> retrieveAllFacture() {
        return ifactureService.retrieveAllFactures();
    }


    @GetMapping("/retrieveFacture/{id}")
    public Facture retrieveFacture(@PathVariable(value="id") Long id) {
        return ifactureService.retrieveFacture(id);

    }





}

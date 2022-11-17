package com.example.gestionmagasinstock.Controllers;


import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Services.IproduitService;
import com.example.gestionmagasinstock.Services.IstockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produit")
public class ProduitRestController {

    @Autowired
    IproduitService iproduitService;



    @GetMapping("RetieveAllProduit")
    public List<Produit> retrieveAllProduit() {
        return iproduitService.retrieveAllProduits();
    }



    @PostMapping("/AddProduit")
    public  Produit addProduit(@RequestBody Produit p , Long idRayon, Long idStock){
        return  iproduitService.addProduit(p,idRayon,idStock);
    }




    @GetMapping("/retrieveProduit/{id}")
    public Produit retrieveProduit(@PathVariable(value="id") Long id) {
        return iproduitService.retrieveProduit(id);

    }



}

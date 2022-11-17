package com.example.gestionmagasinstock.Controllers;


import com.example.gestionmagasinstock.Entities.Client;
import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Services.IclientService;
import com.example.gestionmagasinstock.Services.IstockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stock")
public class StockRestController {

    @Autowired
    IstockService istockService;


    @GetMapping("RetieveAllStock")
    public List<Stock> retrieveAllCStocks() {
        return istockService.retrieveAllStocks();
    }




    @PostMapping("/AddStock")
    public  Stock addStock(@RequestBody Stock s){
        return  istockService.addStock(s);
    }




    @PutMapping("/updateStock")
    public  Stock updateStock(@RequestBody Stock s){return  istockService.updateStock(s);}



    @GetMapping("/retrieveStock/{id}")
    public Stock retrieveContrat(@PathVariable(value="id") Long id) {
        return istockService.retrieveStock(id);

    }



}

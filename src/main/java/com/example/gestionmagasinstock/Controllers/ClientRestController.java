package com.example.gestionmagasinstock.Controllers;


import com.example.gestionmagasinstock.Entities.Client;
import com.example.gestionmagasinstock.Services.IclientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientRestController {

    @Autowired
    IclientService iclientService;



    @GetMapping("RetieveAllClient")
    public List<Client> retrieveAllClients() {
        return iclientService.retrieveAllClients();
    }




    @PostMapping("/AddClient")
    public  Client addClient(@RequestBody Client c){
        return  iclientService.addClient(c);
    }



    @PutMapping("/updateClient")
    public  Client updateClient(@RequestBody Client c){return  iclientService.updateClient(c);}



    @GetMapping("/retrieveClient/{id}")

    public Client retrieveContrat(@PathVariable(value="id") Long id) {
        return iclientService.retrieveClient(id);

    }



    @DeleteMapping("/removeClient/{id}")
    public void deleteClient(@PathVariable(value ="id") Long id) {
        iclientService.deleteClient(id);
    }









}

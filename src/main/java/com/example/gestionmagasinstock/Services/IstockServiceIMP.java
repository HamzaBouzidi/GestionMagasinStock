package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Repository.ProduitRepository;
import com.example.gestionmagasinstock.Repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IstockServiceIMP implements  IstockService{

    @Autowired
    StockRepository StockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
         return StockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return StockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return StockRepository.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return StockRepository.findById(id).orElse(null);
    }
}

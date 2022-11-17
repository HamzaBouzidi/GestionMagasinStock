package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Stock;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IstockServiceIMP implements  IstockService{
    @Override
    public List<Stock> retrieveAllStocks() {
        return null;
    }

    @Override
    public Stock addStock(Stock s) {
        return null;
    }

    @Override
    public Stock updateStock(Stock u) {
        return null;
    }

    @Override
    public Stock retrieveStock(Long id) {
        return null;
    }
}

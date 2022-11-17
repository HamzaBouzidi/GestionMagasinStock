package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Stock;

import java.util.List;

public interface IstockService {

    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
}

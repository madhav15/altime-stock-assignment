package com.altimetrik.test.StockApplication.service;

import com.altimetrik.test.StockApplication.model.Stock;

import java.util.List;

public interface StockService {

    Stock save(Stock stock);

    Stock update(Long id, Stock stock);

    Stock findById(Long id);

    List<Stock> findAll();
}

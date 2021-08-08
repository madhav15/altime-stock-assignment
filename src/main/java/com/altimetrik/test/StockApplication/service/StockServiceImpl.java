package com.altimetrik.test.StockApplication.service;

import com.altimetrik.test.StockApplication.model.Stock;
import com.altimetrik.test.StockApplication.repository.StockRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Stock save(Stock stock) {
        stock.setPurchaseDate(new Date());
        return stockRepository.save(stock);
    }

    @Override
    public Stock update(Long id, Stock stock) {
        Optional<Stock> optionalStock = stockRepository.findById(id);
        if (!optionalStock.isPresent()) {
            throw new RuntimeException("Stock with Id " + id + " Not Found");
        }
        Stock currentStock = optionalStock.get();
        BeanUtils.copyProperties(stock, currentStock);
        currentStock.setPurchaseDate(new Date());
        currentStock.setStockId(id);
        return stockRepository.save(currentStock);
    }

    @Override
    public Stock findById(Long id) {
        Optional<Stock> optionalStock = stockRepository.findById(id);
        return optionalStock.orElse(null);
    }

    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

}

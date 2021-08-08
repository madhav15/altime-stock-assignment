package com.altimetrik.test.StockApplication.controller;

import com.altimetrik.test.StockApplication.model.Stock;
import com.altimetrik.test.StockApplication.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/create")
    public Stock saveNewStock(@RequestBody Stock stock) {
        return stockService.save(stock);
    }

    @PutMapping("/update/{id}")
    public Stock updateStock(@PathVariable Long id, @RequestBody  Stock stock) {
        return stockService.update(id, stock);
    }

    @GetMapping("/display")
    public List<Stock> displayAll() {
        return stockService.findAll();
    }

    @GetMapping("/display/{id}")
    public Stock displayById(@PathVariable Long id) {
        return stockService.findById(id);
    }
}

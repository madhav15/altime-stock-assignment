package com.altimetrik.test.StockApplication.repository;

import com.altimetrik.test.StockApplication.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}

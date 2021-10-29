package com.example.sellservicespringproject.dao;


import com.example.sellservicespringproject.models.entities.Price;
import com.example.sellservicespringproject.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepo extends JpaRepository<Price, Long> {

    List<Price> findAllByProduct(Product product);

    @Query(value = "select * from prices where product_id = ?1 and current_timestamp > start_date and current_timestamp < end_date"
            , nativeQuery = true)
    Price findActualPrice(Product product);

    double getPriceByProductBarcode(String barcode);
}

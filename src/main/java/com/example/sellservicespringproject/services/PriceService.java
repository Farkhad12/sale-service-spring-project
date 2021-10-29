package com.example.sellservicespringproject.services;

import com.example.sellservicespringproject.models.dtos.PriceDto;
import com.example.sellservicespringproject.models.dtos.ProductDto;
import org.springframework.http.ResponseEntity;

public interface PriceService {

    ResponseEntity<?> savePrice(PriceDto priceDto);


    ResponseEntity<?> getAllPrices(String token);

    double findPriceByProductForOperationDetails(ProductDto productDto);

    double getPriceByProductBarcode(String barcode);
}
package com.example.sellservicespringproject.controllers;

import com.example.sellservicespringproject.models.dtos.PriceDto;
import com.example.sellservicespringproject.models.dtos.ProductDto;
import com.example.sellservicespringproject.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping("/save")
    public ResponseEntity<?> savePrice(@RequestBody PriceDto priceDto) {
        return priceService.savePrice(priceDto);
    }

    @GetMapping("/getAllPrices")
    public ResponseEntity<?> getAllPrices(@RequestHeader String token) {
        return priceService.getAllPrices(token);
    }
}
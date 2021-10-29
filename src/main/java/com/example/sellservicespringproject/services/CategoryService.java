package com.example.sellservicespringproject.services;

import com.example.sellservicespringproject.models.dtos.CategoryDto;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

    ResponseEntity<?> saveCategory(CategoryDto categoryDto);

    ResponseEntity<?> getByName(String name);

    ResponseEntity<?> getAllCategories(String token);
}
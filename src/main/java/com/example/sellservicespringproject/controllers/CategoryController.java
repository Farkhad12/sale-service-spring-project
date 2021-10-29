package com.example.sellservicespringproject.controllers;

import com.example.sellservicespringproject.models.dtos.CategoryDto;
import com.example.sellservicespringproject.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public ResponseEntity<?> saveCategory (@RequestBody CategoryDto categoryDto) {
        return categoryService.saveCategory(categoryDto);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateCategory( @RequestBody CategoryDto categoryDto) {
        return categoryService.saveCategory(categoryDto);
    }

    @GetMapping("/getByName")
    public ResponseEntity<?> getByName (@RequestParam String name) {
        return categoryService.getByName(name);
    }

    @GetMapping("/getAllCategories")
    public ResponseEntity<?> getAllCategories (@RequestHeader String token) {
        return categoryService.getAllCategories(token);
    }
}
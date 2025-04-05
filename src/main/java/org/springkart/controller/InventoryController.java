package org.springkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springkart.entity.Product;
import org.springkart.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @PostMapping("/add")
    public ResponseEntity<?> addProducts(@RequestBody Product product) {
        inventoryService.addProducts(product);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok().body(inventoryService.getAllProducts());
    }

    @GetMapping("/health-check")
    public ResponseEntity<?> healthCheck() {

        return ResponseEntity.ok().body("Success");
    }
}

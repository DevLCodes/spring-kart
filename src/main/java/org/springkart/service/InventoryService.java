package org.springkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springkart.entity.Product;
import org.springkart.repository.InventoryRepository;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public void addProducts(final Product product) {
        inventoryRepository.save(product);
    }

    public void removeProduct(final Long productId) {
        inventoryRepository.deleteById(productId);
    }
    public List<Product> getAllProducts() {
        return inventoryRepository.findAll();
    }

}

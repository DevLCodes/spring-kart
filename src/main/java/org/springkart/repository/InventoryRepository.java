package org.springkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springkart.entity.Product;

@Repository
public interface InventoryRepository extends JpaRepository<Product, Long> {
}

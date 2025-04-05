package org.springkart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShoppingCart {
    @Id
    private Long cartId;
}

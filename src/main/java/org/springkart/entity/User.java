package org.springkart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


public abstract class User {
    @ManyToOne
    @JoinColumn(name = "order_id")
    public Order order;

    @Id
    private Long userId;

    private Account account;

    public abstract ShoppingCart getShoppingCart();
}

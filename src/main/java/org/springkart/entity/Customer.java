package org.springkart.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Getter
public class Customer extends User {

    @OneToOne
    @JoinColumn(name = "cart_id")
    private ShoppingCart cart;


    public boolean placeOrder(Order order) {
        return true;
    }

    @Override
    public ShoppingCart getShoppingCart() {
        return cart;
    }
}

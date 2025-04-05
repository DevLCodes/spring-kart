package org.springkart.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class Account {

    public String username;

    public String password;

    public String email;

    public ShoppingCart shoppingCart;

    public List<Order> orderHistory;

    public List<Review> reviewHistory;

    public List<String> shippingAddress;

}

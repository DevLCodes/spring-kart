package org.springkart.entity;


public class Guest extends User {
    @Override
    public ShoppingCart getShoppingCart() {
        return null;
    }

    public boolean registerAccount(){
        return false;
    }
}

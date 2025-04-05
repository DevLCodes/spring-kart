package org.springkart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;


public class Order {

    private Long id;

    private List<Product> products;
}

package org.springkart.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Product {

    public Long productId;

    public String productName;

    public String productDescription;

    public String productPrice;

    public List<String> imageUrls;

    public List<Review> productReviews;

    public Category category;
}

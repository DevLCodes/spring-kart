package org.springkart.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long productId;

    public String productName;

    public String productDescription;

    public String productPrice;

  /*  @ElementCollection
    @CollectionTable(name = "product_image", joinColumns = @JoinColumn(name = "productId"))
    @Column(name="image_url")
    public List<String> imageUrls;

    /*@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Review> productReviews;

    public Category category; */
}

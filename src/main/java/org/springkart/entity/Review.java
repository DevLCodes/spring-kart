package org.springkart.entity;

import jakarta.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long reviewId;

    private String reviewText;

    //@OneToMany(mappedBy = "user")
    //private User reviewer;

    private int rating;
}

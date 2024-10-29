package it.mikedmc.spring_eshop.model;

import jakarta.persistence.*;

public class ProductReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

}
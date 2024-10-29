package it.mikedmc.spring_eshop.model;

import jakarta.persistence.*;

@Entity
public class ProductColor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;
}

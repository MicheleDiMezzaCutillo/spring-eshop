package it.mikedmc.spring_eshop.model;

import it.mikedmc.spring_eshop.model.enums.Category;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    private String name;
    private String description;

    private String imageLink;
    private double price;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(nullable = false)
    private double discount = 0.0;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductColor> colors;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductSize> sizes;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<Review> reviews;

}

package it.mikedmc.spring_eshop.model;

import jakarta.persistence.*;

import java.util.List;

public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;
    String name;

    @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
    private List<ProductColor> productColors;

}

package it.mikedmc.spring_eshop.model;

import jakarta.persistence.*;

import java.util.List;

public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    private String name;

}
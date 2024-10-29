package it.mikedmc.spring_eshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    private String name;

    private String email;

    private String body;

    private double rating;
    @Column(name = "date_created")
    private LocalDate dateCreated = LocalDate.now();

}

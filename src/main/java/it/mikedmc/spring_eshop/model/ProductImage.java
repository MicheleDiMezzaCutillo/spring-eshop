package it.mikedmc.spring_eshop.model;

import jakarta.persistence.*;

/***
 * Rappresenta il collegamento di un immagine con un prodotto, un prodotto avrà più immagini
 */
@Entity
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String link;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}

package it.mikedmc.spring_eshop.model;

import jakarta.persistence.*;

import java.time.LocalDate;

/***
 * Entità per la gestione degli utenti che hanno voluto iscriversi alla Newsletter del sito.
 */
@Entity
public class Newsletter {

    public Newsletter() {
    }

    public Newsletter(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    private String name;

    private String email;

    @Column(name = "date_created")
    private LocalDate dateCreated = LocalDate.now();

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
}

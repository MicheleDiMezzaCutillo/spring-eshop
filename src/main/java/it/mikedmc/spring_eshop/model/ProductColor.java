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

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

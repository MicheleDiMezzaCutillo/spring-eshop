package it.mikedmc.spring_eshop.model;

import it.mikedmc.spring_eshop.model.enums.Category;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

    private double price;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(nullable = false)
    private double discount = 0.0;

    @Column(name = "date_created")
    private LocalDate dateCreated = LocalDate.now();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductColor> colors;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductSize> sizes;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductReview> reviews;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductImage> images;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public void setImages(List<ProductImage> images) {
        this.images = images;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<ProductColor> getColors() {
        return colors;
    }

    public void setColors(List<ProductColor> colors) {
        this.colors = colors;
    }

    public List<ProductSize> getSizes() {
        return sizes;
    }

    public void setSizes(List<ProductSize> sizes) {
        this.sizes = sizes;
    }

    public List<ProductReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<ProductReview> reviews) {
        this.reviews = reviews;
    }
}

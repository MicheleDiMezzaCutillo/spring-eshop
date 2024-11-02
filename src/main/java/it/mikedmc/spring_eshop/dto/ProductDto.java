package it.mikedmc.spring_eshop.dto;

import it.mikedmc.spring_eshop.model.Color;
import it.mikedmc.spring_eshop.model.Product;
import it.mikedmc.spring_eshop.model.ProductColor;
import it.mikedmc.spring_eshop.model.Size;

public class ProductDto {
    private double id;
    private Size size;
    private Color color;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

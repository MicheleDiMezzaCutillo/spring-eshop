package it.mikedmc.spring_eshop.repository;

import it.mikedmc.spring_eshop.model.Color;
import it.mikedmc.spring_eshop.model.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductColorRepository extends JpaRepository<ProductColor, Double> {
    List<ProductColor> findByColor(Color color);
}

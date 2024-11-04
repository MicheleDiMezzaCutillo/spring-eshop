package it.mikedmc.spring_eshop.repository;

import it.mikedmc.spring_eshop.model.Color;
import it.mikedmc.spring_eshop.model.Product;
import it.mikedmc.spring_eshop.model.Size;
import it.mikedmc.spring_eshop.model.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Double> {
    List<Product> findByNameLike(String name);
    List<Product> findByCategory(Category category);

}

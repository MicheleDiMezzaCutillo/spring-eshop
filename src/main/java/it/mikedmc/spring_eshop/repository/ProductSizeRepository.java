package it.mikedmc.spring_eshop.repository;

import it.mikedmc.spring_eshop.model.ProductSize;
import it.mikedmc.spring_eshop.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductSizeRepository extends JpaRepository<ProductSize, Double> {
    List<ProductSize> findBySize(Size size);
}

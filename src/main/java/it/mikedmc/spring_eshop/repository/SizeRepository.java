package it.mikedmc.spring_eshop.repository;

import it.mikedmc.spring_eshop.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<Size, Double> {
    public Size findByName(String name);
}

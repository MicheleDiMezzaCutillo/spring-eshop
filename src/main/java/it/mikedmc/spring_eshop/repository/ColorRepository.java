package it.mikedmc.spring_eshop.repository;

import it.mikedmc.spring_eshop.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Double> {
}

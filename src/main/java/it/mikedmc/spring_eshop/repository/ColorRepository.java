package it.mikedmc.spring_eshop.repository;

import it.mikedmc.spring_eshop.model.Color;
import it.mikedmc.spring_eshop.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Double> {

    public Color findByName(String name);

}

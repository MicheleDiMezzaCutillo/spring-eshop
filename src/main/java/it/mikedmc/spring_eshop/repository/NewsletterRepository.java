package it.mikedmc.spring_eshop.repository;


import it.mikedmc.spring_eshop.model.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterRepository extends JpaRepository<Newsletter, Double> {
}

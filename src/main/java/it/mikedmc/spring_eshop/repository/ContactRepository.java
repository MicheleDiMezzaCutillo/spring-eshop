package it.mikedmc.spring_eshop.repository;

import it.mikedmc.spring_eshop.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Double> {
}

package it.mikedmc.spring_eshop.service;

import it.mikedmc.spring_eshop.model.Contact;
import it.mikedmc.spring_eshop.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact save (Contact contact) {
        return contactRepository.save(contact);
    }

}

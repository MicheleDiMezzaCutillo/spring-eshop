package it.mikedmc.spring_eshop.dto.builder;

import it.mikedmc.spring_eshop.dto.ContactDto;
import it.mikedmc.spring_eshop.model.Contact;
import org.hibernate.bytecode.spi.ReflectionOptimizer;

public class ContactDtoBuilder {
    public static Contact fromDtoToEntity (ContactDto contactDto) {
        Contact contact = new Contact();
        contact.setName(contactDto.getName());
        contact.setEmail(contact.getEmail());
        contact.setSubject(contactDto.getSubject());
        contact.setMessage(contact.getMessage());
        return contact;
    }

    public static ContactDto fromEntityToDto (Contact contact) {
        ContactDto contactDto = new ContactDto();
        contactDto.setEmail(contact.getEmail());
        contactDto.setMessage(contact.getMessage());
        contactDto.setSubject(contact.getSubject());
        contactDto.setName(contactDto.getName());
        return contactDto;
    }
}

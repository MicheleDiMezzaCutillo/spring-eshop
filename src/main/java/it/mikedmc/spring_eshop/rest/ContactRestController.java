package it.mikedmc.spring_eshop.rest;

import it.mikedmc.spring_eshop.dto.ContactDto;
import it.mikedmc.spring_eshop.dto.NewsletterDto;
import it.mikedmc.spring_eshop.dto.builder.ContactDtoBuilder;
import it.mikedmc.spring_eshop.dto.builder.NewsletterDtoBuilder;
import it.mikedmc.spring_eshop.service.ContactService;
import it.mikedmc.spring_eshop.service.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contact")
public class ContactRestController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/message") // POST per inserire i dati dell'utente che si registra
    public ResponseEntity<String> addMessage(@Validated @RequestBody ContactDto contactDto, BindingResult result) {

        // Controllo che i campi siano validi.
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().stream()
                    .map(error -> error.getDefaultMessage())
                    .collect(Collectors.joining(", "));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }

        contactService.save(ContactDtoBuilder.fromDtoToEntity(contactDto));
        return ResponseEntity.ok("Messaggio mandato con successo.");
    }

}

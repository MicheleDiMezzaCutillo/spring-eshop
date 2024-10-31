package it.mikedmc.spring_eshop.rest;

import it.mikedmc.spring_eshop.dto.NewsletterDto;
import it.mikedmc.spring_eshop.dto.builder.NewsletterDtoBuilder;
import it.mikedmc.spring_eshop.model.Newsletter;
import it.mikedmc.spring_eshop.service.NewsletterService;
import jakarta.servlet.http.HttpSession;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/newsletter")
public class NewsletterRestController {

    @Autowired
    private NewsletterService newsletterService;

    @PostMapping("/register") // POST per inserire i dati dell'utente che si registra
    public ResponseEntity<String> register(@Validated @RequestBody NewsletterDto newsletterDto, BindingResult result) {

        // Controllo che i campi siano validi.
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().stream()
                    .map(error -> error.getDefaultMessage())
                    .collect(Collectors.joining(", "));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }

        if (newsletterService.findByEmail(newsletterDto.getEmail()) != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("L'email è già registrata.");
        }


        newsletterService.save(NewsletterDtoBuilder.fromDtoToEntity(newsletterDto));
        return ResponseEntity.ok("Successo");
    }

}

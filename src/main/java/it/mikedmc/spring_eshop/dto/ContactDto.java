package it.mikedmc.spring_eshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ContactDto {

    @NotNull(message = "Nome mancante")
    @NotEmpty(message = "Nome mancante")
    @NotBlank(message = "Nome non valido")
    private String name;

    @NotNull(message = "Email mancante")
    @NotEmpty(message = "Email mancante")
    @NotBlank(message = "Email non valida")
    private String email;


    @NotNull(message = "Oggetto mancante")
    @NotEmpty(message = "Oggetto mancante")
    @NotBlank(message = "Oggetto non valido")
    private String subject;


    @NotNull(message = "Messaggio non valido")
    @NotEmpty(message = "Messaggio vuoto")
    @NotBlank(message = "Messaggio vuoto")
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

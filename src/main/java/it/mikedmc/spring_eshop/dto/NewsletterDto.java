package it.mikedmc.spring_eshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class NewsletterDto {

    public NewsletterDto() {
    }

    public NewsletterDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @NotNull(message = "Nome mancante")
    @NotEmpty(message = "Nome mancante")
    @NotBlank(message = "Nome non valido")
    private String name;

    @NotNull(message = "Email mancante")
    @NotEmpty(message = "Email mancante")
    @NotBlank(message = "Email non valida")
    private String email;

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
}

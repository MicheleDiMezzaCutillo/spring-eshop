package it.mikedmc.spring_eshop.dto.builder;

import it.mikedmc.spring_eshop.dto.NewsletterDto;
import it.mikedmc.spring_eshop.model.Newsletter;

public class NewsletterDtoBuilder {
    public NewsletterDto fromEntityToDto(Newsletter entity) {
        return new NewsletterDto(entity.getName(),entity.getEmail());
    }

    public Newsletter fromDtoToEntity(NewsletterDto dto) {
        return new Newsletter(dto.getName(),dto.getEmail());
    }
}

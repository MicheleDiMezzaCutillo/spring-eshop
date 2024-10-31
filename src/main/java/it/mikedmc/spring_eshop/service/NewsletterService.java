package it.mikedmc.spring_eshop.service;

import it.mikedmc.spring_eshop.model.Newsletter;
import it.mikedmc.spring_eshop.repository.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsletterService {

    @Autowired
    private NewsletterRepository newsletterRepository;

    public Newsletter save (Newsletter newsletter) {
        return newsletterRepository.save(newsletter);
    }

}

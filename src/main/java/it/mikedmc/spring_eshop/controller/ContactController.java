package it.mikedmc.spring_eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/contact")
    public String home (Model model) {


        model.addAttribute("userCart",null);
        return "contact";
    }
}

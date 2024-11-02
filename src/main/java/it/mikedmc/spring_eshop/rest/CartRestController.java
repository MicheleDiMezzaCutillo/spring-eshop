package it.mikedmc.spring_eshop.rest;

import it.mikedmc.spring_eshop.model.Product;
import it.mikedmc.spring_eshop.service.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cart")
public class CartRestController {

    @Autowired
    private ProductService productService;

    /***
     * Endpoint per ottenere il numero di articoli nel carrello dell'utente
     * @param session
     * @return numero di articoli nel carrello
     */
    @GetMapping("/size")
    public ResponseEntity<Integer> size(HttpSession session) {
        List<Product> userCart = (List<Product>) session.getAttribute("userCart");

        int size = 0;
        if (userCart != null) {
            size = userCart.size();
        }
        return ResponseEntity.ok(size);
    }

}

package it.mikedmc.spring_eshop.service;

import it.mikedmc.spring_eshop.model.Product;
import it.mikedmc.spring_eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchProductsByName(String name) {
        return productRepository.findByNameLike("%" + name + "%");
    }

    public Optional<Product> findById(double id){
        return productRepository.findById(id);
    }

    public List<Product> findAll () {
        return productRepository.findAll();
    }
}

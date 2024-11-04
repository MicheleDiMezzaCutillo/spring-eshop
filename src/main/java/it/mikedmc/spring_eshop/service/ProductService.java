package it.mikedmc.spring_eshop.service;

import it.mikedmc.spring_eshop.model.Color;
import it.mikedmc.spring_eshop.model.Product;
import it.mikedmc.spring_eshop.model.Size;
import it.mikedmc.spring_eshop.model.enums.Category;
import it.mikedmc.spring_eshop.repository.ColorRepository;
import it.mikedmc.spring_eshop.repository.ProductRepository;
import it.mikedmc.spring_eshop.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private ColorRepository colorRepository;

    public List<Product> findByName(String name) {
        return productRepository.findByNameLike("%" + name + "%");
    }

    public List<Product> findByCategory (Category category) {
        return productRepository.findByCategory(category);
    }

    public Optional<Product> findById(double id){
        return productRepository.findById(id);
    }

    public List<Product> findAll () {
        return productRepository.findAll();
    }

}

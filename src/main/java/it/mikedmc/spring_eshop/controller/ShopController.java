package it.mikedmc.spring_eshop.controller;

import it.mikedmc.spring_eshop.model.Color;
import it.mikedmc.spring_eshop.model.Product;
import it.mikedmc.spring_eshop.model.Size;
import it.mikedmc.spring_eshop.model.enums.Category;
import it.mikedmc.spring_eshop.repository.ColorRepository;
import it.mikedmc.spring_eshop.repository.ProductColorRepository;
import it.mikedmc.spring_eshop.repository.ProductSizeRepository;
import it.mikedmc.spring_eshop.repository.SizeRepository;
import it.mikedmc.spring_eshop.service.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShopController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private ProductSizeRepository productSizeRepository;

    @Autowired
    private ProductColorRepository productColorRepository;

    @GetMapping("/shop")
    public String home(
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "size", required = false) String size,
            @RequestParam(value = "color", required = false) String color,
            Model model,
            HttpSession session
    ) {
        List<Product> products;

        if (category != null) {
            products = productService.findByCategory(Category.valueOf(category));
        } else if (name != null) {
            products = productService.findByName(name);
        } else if (size != null) {
            Size size1 = sizeRepository.findByName(size);
            products = productSizeRepository.findBySize(size1).stream().map(productSize -> productSize.getProduct()).collect(Collectors.toList());
        }else if (color != null) {
            Color color1 = colorRepository.findByName(color);
            products = productColorRepository.findByColor(color1).stream().map(productColor -> productColor.getProduct()).collect(Collectors.toList());
        } else {
            products = productService.findAll();
        }


        model.addAttribute("products", products);

        List<Color> colorList = colorRepository.findAll();
        List<Size> sizeList = sizeRepository.findAll();
        model.addAttribute("colorList", colorList);
        model.addAttribute("sizeList", sizeList);
        return "shop";
    }

}

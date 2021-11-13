package com.example.mg.controller;

import com.example.mg.dao.ProductDao;
import com.example.mg.service.ProductService;
import com.example.mg.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/index"})
public class IndexController {

    private final ProductService productService;
    private final ProductDao productDao;

    @Autowired
    public IndexController(ProductService productService, ProductDao productDao) {
        this.productService = productService;
        this.productDao = productDao;
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("products", productService.getAllProduct());
        return "index";
    }
}

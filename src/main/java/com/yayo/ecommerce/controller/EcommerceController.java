package com.yayo.ecommerce.controller;

import com.yayo.ecommerce.model.Product;
import com.yayo.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class EcommerceController {

    private final EcommerceService ecommerceService;

    @Autowired
    public EcommerceController(EcommerceService ecommerceService){
        this.ecommerceService = ecommerceService;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return ecommerceService.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return ecommerceService.getAllProducts();
    }
}

package com.yayo.ecommerce.service;

import com.yayo.ecommerce.model.Product;
import com.yayo.ecommerce.repository.EcommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceService {

    private final EcommerceRepository ecommerceRepository;

    @Autowired
    public EcommerceService(EcommerceRepository ecommerceRepository){
        this.ecommerceRepository = ecommerceRepository;
    }

    public List<Product> getAllProducts(){
        return ecommerceRepository.findAll();
    }

    public Product saveProduct(Product product){
        return ecommerceRepository.save(product);
    }
}

package com.yayo.ecommerce.repository;

import com.yayo.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcommerceRepository extends JpaRepository<Product, Long> {


}

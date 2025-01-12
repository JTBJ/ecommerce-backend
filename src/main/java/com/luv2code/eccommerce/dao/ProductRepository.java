package com.luv2code.eccommerce.dao;

import com.luv2code.eccommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.bokharycode.ecommerce.dao;

import com.bokharycode.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // Frontend seems to work without this. Can't find why
public interface ProductRepository extends JpaRepository<Product, Long> {
}

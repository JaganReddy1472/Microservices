package com.productService.product_service_microsevice.Repository;

import com.productService.product_service_microsevice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String>{

}

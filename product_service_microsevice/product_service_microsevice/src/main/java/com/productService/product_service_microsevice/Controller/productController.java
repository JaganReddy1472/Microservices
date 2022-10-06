package com.productService.product_service_microsevice.Controller;


import com.productService.product_service_microsevice.Service.ProductService;
import com.productService.product_service_microsevice.dto.ProductRequest;
import com.productService.product_service_microsevice.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class productController {



    @Autowired
    private  ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createproduct(@RequestBody ProductRequest productRequest){
            productService.createproduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProducts(){
       return  productService.getAllProduct();

    }

}

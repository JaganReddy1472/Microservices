package com.productService.product_service_microsevice.Service;

import com.productService.product_service_microsevice.Repository.ProductRepository;
import com.productService.product_service_microsevice.dto.ProductRequest;
import com.productService.product_service_microsevice.dto.ProductResponse;
import com.productService.product_service_microsevice.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {


    @Autowired
    private  ProductRepository productRepository;

    public void createproduct(ProductRequest productRequest){
        Product product= Product.builder().
                name(productRequest.getName()).
                description(productRequest.getDescription()).
                price(productRequest.getPrice()).
                build();
        productRepository.save(product);
        log.info("Product is created"+product.getId());

    }
    public List<ProductResponse> getAllProduct(){

        List<Product> products=productRepository.findAll();
        return products.stream().map(this::maptoProductResponse).collect(Collectors.toList());
                //getAllProductResponses(product);
    }

    public ProductResponse maptoProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

}

package com.interview.service;

import com.interview.model.Product;
import com.interview.model.ProductAddRequest;
import com.interview.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void saveProduct(ProductAddRequest productAddRequest)
    {
        Product newProduct = Product.builder()
                .name(productAddRequest.name())
                .build();

        productRepository.save(newProduct);
    }

}

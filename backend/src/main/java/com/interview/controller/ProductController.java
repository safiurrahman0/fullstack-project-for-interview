package com.interview.controller;

import com.interview.model.ProductAddRequest;
import com.interview.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public void addProduct(@RequestBody ProductAddRequest productAddRequest)
    {
        log.info("Requested product to be saved: {}", productAddRequest);
        productService.saveProduct(productAddRequest);
        log.info("New product saved successfully : {}", productAddRequest);
    }

}

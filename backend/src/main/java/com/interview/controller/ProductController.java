package com.interview.controller;

import com.interview.model.Product;
import com.interview.model.ProductAddRequest;
import com.interview.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;


    /**
     * API to return list of all Products stored in DB
     * @return
     */
    @GetMapping("/getAll")
    public List<Product> getAllProducts()
    {
        return productService.listAllProducts();
    }

    /**
     * API to save a Product with name to DB
     * @param productAddRequest
     */
    @PostMapping
    public void addProduct(@RequestBody ProductAddRequest productAddRequest)
    {
        log.info("Requested product to be saved: {}", productAddRequest);
        productService.saveProduct(productAddRequest);
        log.info("New product saved successfully : {}", productAddRequest);
    }

}

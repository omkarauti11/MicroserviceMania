package com.myproject.ProductService.service;

import com.myproject.ProductService.model.ProductRequest;
import com.myproject.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}

package com.henry.springbootmall.dao;

import com.henry.springbootmall.dto.ProductRequest;
import com.henry.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);
}

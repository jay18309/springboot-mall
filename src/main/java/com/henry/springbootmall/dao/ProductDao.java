package com.henry.springbootmall.dao;

import com.henry.springbootmall.constant.ProductCategory;
import com.henry.springbootmall.dto.ProductRequest;
import com.henry.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

package com.henry.springbootmall.service.impl;

import com.henry.springbootmall.dao.ProductDao;
import com.henry.springbootmall.dto.ProductRequest;
import com.henry.springbootmall.model.Product;
import com.henry.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}

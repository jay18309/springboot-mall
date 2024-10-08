package com.henry.springbootmall.dto;

import com.henry.springbootmall.constant.ProductCategory;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProductRequest {

    @NotNull
    private String productName;

    @NotNull
    private ProductCategory category;

    @NotNull
    private String imageUrl;

    @NotNull
    private Integer price;

    @NotNull
    private Integer stock;

    private String description;

}

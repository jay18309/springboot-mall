package com.henry.springbootmall.dto;

import com.henry.springbootmall.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {

    private ProductCategory category;
    private String search;
    private String orderBy;
    private String sort;
    Integer limit;
    Integer offset;
}

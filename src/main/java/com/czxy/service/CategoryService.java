package com.czxy.service;

import com.czxy.dataobject.ProductCategory;

import java.util.List;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/29
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

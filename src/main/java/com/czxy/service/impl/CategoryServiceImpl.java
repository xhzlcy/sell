package com.czxy.service.impl;

import com.czxy.dataobject.ProductCategory;
import com.czxy.dataobject.ProductInfo;
import com.czxy.enums.ResultEnum;
import com.czxy.exception.SellException;
import com.czxy.repository.ProductCategoryRepository;
import com.czxy.repository.ProductInfoRepository;
import com.czxy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类目
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/29
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }

    @Override
    public void delete(Integer categoryId) {
        List<ProductInfo> categoryType = productInfoRepository.findByCategoryType(categoryId);
        if(categoryType.size()>0){
            throw new SellException(ResultEnum.CATEGORY_DELETE_ERROR);
        }
        repository.delete(categoryId);
    }
}

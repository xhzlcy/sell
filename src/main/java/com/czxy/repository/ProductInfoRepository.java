package com.czxy.repository;

import com.czxy.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/29
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);


    List<ProductInfo> findByCategoryType(Integer categoryType);
}

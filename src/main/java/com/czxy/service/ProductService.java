package com.czxy.service;

import com.czxy.dataobject.ProductInfo;
import com.czxy.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/29
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
   void increaseStock(List<CartDTO> cartDTOList);

   //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}

package com.czxy.dto;

import lombok.Data;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

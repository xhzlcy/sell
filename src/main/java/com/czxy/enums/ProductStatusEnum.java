package com.czxy.enums;

import lombok.Getter;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/29
 */
@Getter
public enum ProductStatusEnum {
   Up(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

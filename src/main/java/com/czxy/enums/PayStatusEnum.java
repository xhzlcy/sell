package com.czxy.enums;

import lombok.Getter;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),

    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

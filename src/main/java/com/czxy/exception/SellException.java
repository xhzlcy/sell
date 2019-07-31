package com.czxy.exception;

import com.czxy.enums.ResultEnum;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
public class SellException extends RuntimeException{

    private Integer code;


    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}

package com.czxy.utils;

import com.czxy.enums.CodeEnum;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/9/2
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}

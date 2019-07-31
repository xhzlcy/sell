package com.czxy.VO;

import lombok.Data;

/**
 * http请求返回最外层对象
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/29
 */
@Data
public class ResultVO<T> {
    /** 错误码 */
    private Integer code;
    /** 提示信息 */
    private String msg;
    /** 具体内容 */
    private T data;


}

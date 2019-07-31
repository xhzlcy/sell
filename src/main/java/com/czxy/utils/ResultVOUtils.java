package com.czxy.utils;

import com.czxy.VO.ResultVO;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
public class ResultVOUtils {
    
    public static ResultVO success(Object obj){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(obj);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
      return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}

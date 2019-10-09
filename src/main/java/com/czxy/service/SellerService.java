package com.czxy.service;

import com.czxy.dataobject.SellerInfo;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/9/3
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}


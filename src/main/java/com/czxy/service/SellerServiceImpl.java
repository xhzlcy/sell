package com.czxy.service;

import com.czxy.dataobject.SellerInfo;
import com.czxy.repository.SellerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/9/3
 */
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}

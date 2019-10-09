package com.czxy.repository;

import com.czxy.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/9/3
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}


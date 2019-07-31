package com.czxy.repository;

import com.czxy.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {



    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}

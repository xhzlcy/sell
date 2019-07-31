package com.czxy.repository;

import com.czxy.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {


    List<OrderDetail> findByOrderId(String orderId);
}

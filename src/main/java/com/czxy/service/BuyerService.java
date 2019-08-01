package com.czxy.service;

import com.czxy.dto.OrderDTO;

/**
 * 买家
 * @author xuhongzu
 * @version 1.0
 * @date 2019/8/1
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}

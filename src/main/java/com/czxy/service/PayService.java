package com.czxy.service;

import com.czxy.dto.OrderDTO;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/8/3
 */
public interface PayService {

    void create(OrderDTO orderDTO);
}

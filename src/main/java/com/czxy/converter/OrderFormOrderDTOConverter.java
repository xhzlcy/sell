package com.czxy.converter;

import com.czxy.dataobject.OrderDetail;
import com.czxy.dto.OrderDTO;
import com.czxy.enums.ResultEnum;
import com.czxy.exception.SellException;
import com.czxy.form.OrderForm;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
@Slf4j
public class OrderFormOrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm){
        Gson gson =new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList =new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){
                    }.getType());
        } catch (JsonSyntaxException e) {
            log.error("【对象转换错误】,String={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}

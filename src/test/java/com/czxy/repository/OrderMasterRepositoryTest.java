package com.czxy.repository;

import com.czxy.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final  String OPENID ="1010101";
    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("小雨");
        orderMaster.setBuyerPhone("12345678911");
        orderMaster.setBuyerAddress("传智专修学院");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(6.6));
        OrderMaster save = repository.save(orderMaster);
        Assert.assertNotNull(save);
    }


    @Test
    public void findBuyerOpenid() {
        PageRequest request = new PageRequest(0,3);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, request);
        Assert.assertNotEquals(0,result);
    }
}
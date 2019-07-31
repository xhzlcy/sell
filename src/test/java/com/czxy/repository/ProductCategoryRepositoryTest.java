package com.czxy.repository;

import com.czxy.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
       ProductCategory productCategory = repository.findOne(1);
        System.err.println(productCategory);
    }


    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱", 3);
        ProductCategory save = repository.save(productCategory);
        Assert.assertNotNull(save);
        //Assert.assertNotEquals(null,save);
    }


}
package com.czxy.utils;

import java.util.Random;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/7/30
 */
public class KeyUtils {

    public static synchronized String genUniqueKey(){

        Random random = new Random();
      Integer number =  random.nextInt(900000)+100000;
      return  System.currentTimeMillis()+String.valueOf(number);
    }
}

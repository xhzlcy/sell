package com.czxy.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/8/7
 */
public class JsonUtil {
    
    public static String toJson(Object object){

        GsonBuilder gsonBuilder = new GsonBuilder();
        
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}

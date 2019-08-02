package com.czxy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/8/2
 */
@RequestMapping("/weixin")
@RestController
@Slf4j
public class WeiXinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code")String code){
        log.info("进入auth方法");
        log.info("code={}",code);
        String url ="https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx7afcb2d0f7165818&secret=766c50cffa4120349f1f3e370a416f92&code="+code+"&grant_type=authorization_code";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}",response);

    }
}

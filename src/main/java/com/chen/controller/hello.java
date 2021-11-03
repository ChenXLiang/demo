package com.chen.controller;

import com.chen.component.Jdbc;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 包名:com.chen.controller
 *
 * @author : Chen
 * @date : 2021/11/3 9:59
 */
@RestController
@EnableConfigurationProperties(Jdbc.class)
public class hello {
    @Resource
    private Jdbc jdbc;
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(jdbc);
        return "hello";
    }
}

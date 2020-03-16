package com.itoken.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date 2020/3/16
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String configInfo;

    @Value("spring.profiles.active")
    private String profiles;

    @GetMapping("/config")
    public String getInfo() {
        return "获取参数" + profiles + configInfo;
    }


}

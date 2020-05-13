package com.henry.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>启动类<p>
 * @Author Bertram.Wang
 * @Date 2019年3月12日
 */
@SpringBootApplication
// 标识Eureka服务器
@EnableEurekaServer
@RestController
public class EurekaApplication {

    @Autowired
    Environment environment;
    @RequestMapping("/wang")
    public String wang() {
        String property = environment.getProperty("setting.wang","未定义");
        return property;
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}

package cn.apopo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.apopo.properties.HelloProperties;

/**
 * Created by baidu on 16/11/8.
 */

@RestController // Rest风格的controller;@Controller注解,组件扫描会自动将其注册为Spring应用程序上下文里的一个Bean
@RequestMapping("/") // MVC中的注解,路由信息
public class SpringBootDemoController {

//    @Autowired
//    private HelloProperties helloProperties;

    public String helloWorld() {
        return "HelloWorld";
    }

    @RequestMapping("/home")
    public String home() {
        // return helloProperties.getAssociateId();
        return "HelloWorld";
    }

}

package com.luffy.controller;

import cn.hutool.json.JSONUtil;
import com.luffy.config.UserConfig1;
import com.luffy.config.UserConfig2;
import com.luffy.config.UserConfig3;
import com.luffy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloController {
    private static int counter = 0;

    @Autowired
    private HelloService helloService;
    @Autowired
    UserConfig1 userConfig1;
    @Autowired
    UserConfig2 userConfig2;
    @Autowired
    UserConfig3 userConfig3;
    @GetMapping("/hello/{name}")
    public Map<String, Object> sayHello(@PathVariable String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("helloService", helloService.sayHello(name));
        result.put("userConfig1", userConfig1.getName());
        result.put("userConfig2", userConfig2.getName());
        result.put("userConfig3", userConfig3.getName());
        result.put("counter", ++counter);

        return result;
    }
}

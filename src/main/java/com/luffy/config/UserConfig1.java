package com.luffy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig1 {
    //value没有setter的情况下通过反射赋值
    @Value("${test-config.name}")
    private String name;
    @Value("${test-config.password}")
    private String password;



    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

}

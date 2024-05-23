package com.luffy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//需要setter注入
@Configuration
@ConfigurationProperties(prefix = "test-config")
public class UserConfig2 {
    private String name;
    private String password;

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
}

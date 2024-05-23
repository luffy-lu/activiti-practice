package com.luffy.service;


public class HelloService {
    private String msg;
    public HelloService(String msg) {
        this.msg = msg;
    }
    public String sayHello(String name) {
        return name.concat(":"+msg);
    }
}

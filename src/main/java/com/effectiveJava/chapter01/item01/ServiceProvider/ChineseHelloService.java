package com.effectiveJava.chapter01.item01.ServiceProvider;

public class ChineseHelloService implements HelloService {

    @Override
    public String hello() {
        return "ni hao";
    }
}

package com.effectiveJava.chapter01.item01.InterfaceDefault;

import java.util.List;

public interface HelloService {

    String hello();

    // since 8 default & static
    // static method
    static String hi() {
        prepareMessage();
        return "hi";
    }

    // static method
    default String bye() {
        return "bye";
    }

    // since 9
    // TODO 많은 기능들 deprecated?
    private static String prepareMessage() {
        return "prepared";
    }
}

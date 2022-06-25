package com.effectiveJava.chapter01.item01.ServiceProvider;

// 서비스 제공자 인터페이스
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
    // 많은 기능들 deprecated?
    private static String prepareMessage() {
        return "prepared";
    }
}

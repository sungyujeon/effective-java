package com.effectiveJava.chapter01.item03.functionalinterface;

@FunctionalInterface
public interface MyFunction {

    String valueOf(Integer integer);

    // default, static method 추가는 가능
    default void hi() {
        System.out.println("hi");
    }

    static String hello() {
        return "hello";
    }

}

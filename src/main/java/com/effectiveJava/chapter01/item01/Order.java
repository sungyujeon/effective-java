package com.effectiveJava.chapter01.item01;

import java.util.Arrays;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private static OrderStatus orderStatus;  // enum 연습


    // static factory method
    // 장점1: 시그니처가 같은 생성자를 만들어야 할 때 정적 팩토리 메서드를 고려하라
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}

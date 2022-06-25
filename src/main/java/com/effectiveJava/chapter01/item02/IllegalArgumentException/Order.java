package com.effectiveJava.chapter01.item02.IllegalArgumentException;

import java.time.LocalDate;

public class Order {

    public static void main(String[] args) {
        updateDeliveryDate(LocalDate.MIN);
    }

    public static void updateDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate.isBefore(LocalDate.now())) {
            // TODO 과거로 배송해달라고?
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }

        // 배송 날짜 업데이트
    }
}

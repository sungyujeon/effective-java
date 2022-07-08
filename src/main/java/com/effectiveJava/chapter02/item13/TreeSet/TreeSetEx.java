package com.effectiveJava.chapter02.item13.TreeSet;

import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(8);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

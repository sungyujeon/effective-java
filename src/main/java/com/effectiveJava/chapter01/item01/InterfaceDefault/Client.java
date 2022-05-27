package com.effectiveJava.chapter01.item01.InterfaceDefault;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);

        System.out.println(numbers);

        Comparator<Integer> desc = (o1, o2) -> o2 - o1;
        numbers.sort((o1, o2) -> o2 - o1);
        System.out.println(numbers);
        numbers.sort(desc.reversed());
    }
}

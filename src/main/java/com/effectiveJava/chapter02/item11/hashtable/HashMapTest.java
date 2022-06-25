package com.effectiveJava.chapter02.item11.hashtable;

import com.effectiveJava.chapter02.item11.hashcode.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();

        PhoneNumber number1 = new PhoneNumber((short)123, (short)456, (short)7890);
        PhoneNumber number2 = new PhoneNumber((short)123, (short)456, (short)7890);

        // 1) 같은 인스턴스인데 다른 hashCode >> equals 비교에서 논리적 동치여도 다르다고 판단
        // 2) 다른 인스턴스인데 같은 hashCode >> equals 비교에서 달라야 하는데 같다고 판단
        System.out.println(number1.equals(number2));
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());

        map.put(number1, "number1");
        map.put(number2, "number2");

        String s = map.get(number2);
        System.out.println(s);
    }
}

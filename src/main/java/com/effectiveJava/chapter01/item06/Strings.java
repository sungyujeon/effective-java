package com.effectiveJava.chapter01.item06;

public class Strings {

    public static void main(String[] args) {

        // jvm은 contant pool에서 동일한 문자열을 참조하는 방법으로 문자열 재사용
        String hello = "hello";
        String hello2 = new String("hello"); // bad
        String hello3 = "hello";

        System.out.println(hello == hello2);
        System.out.println(hello.equals(hello2));
        System.out.println(hello == hello3);  // 인스턴스가 다를 경우를 대비해 equals()로 값 비교

    }
}

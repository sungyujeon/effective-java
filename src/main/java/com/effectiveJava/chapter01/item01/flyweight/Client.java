package com.effectiveJava.chapter01.item01.flyweight;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();

        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('h', "white", fontFactory.getFont("nanum:12"));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

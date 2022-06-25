package com.effectiveJava.chapter01.item01.flyweight;

import java.util.EnumSet;

public class Font {

    final String family;

    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}


class FontImmutable extends Font {

    private String v;

    public FontImmutable(String family, int size) {
        super(family, size);
        v = "test";
    }

    public void setV(String val) {
        this.v = val;
    }

    public static void main(String[] args) {
        Font f = new FontImmutable("nanum", 1);

        // immutable
        Font f1 = new Font("hi", 1);
        Font f2 = new Font("hi", 1);
//        System.out.println(f1);
//        System.out.println(f2);

        MyEnum one = MyEnum.ONE;
        System.out.println(one.getClass().getTypeName());

        EnumSet enumSet = EnumSet.noneOf(MyEnum.class);
        enumSet.add(MyEnum.ONE);
//        enumSet.add(MyEnum.ONE);
        System.out.println(enumSet.size());
//        System.out.println(enumSet);
    }
}

enum MyEnum {
    ONE, TWO;
}
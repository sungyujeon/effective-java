package com.effectiveJava.chapter01.item03.enumType;

public enum Elvis {
    INSTANCE;

    public void sing() {
        System.out.println("enum is singing");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.sing();
    }
}

package com.effectiveJava.chapter01.item03.staticFactory;

public class Elvis implements Singer {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    // new instance 추가 가능
    public static Elvis newInstance() {
        return new Elvis();
    }

    @Override
    public void sing() {
        System.out.println("sing");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        System.out.println(elvis);

        System.out.println(Elvis.getInstance());
        System.out.println(Elvis.getInstance());
    }
}

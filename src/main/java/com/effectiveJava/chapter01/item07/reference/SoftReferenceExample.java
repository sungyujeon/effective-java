package com.effectiveJava.chapter01.item07.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // SoftReference는 gc 수행되지 않을 수 있음
        // 왜냐면 메모리가 충분해서 굳이 제거할 필요 없음
        System.out.println(soft.get());
    }
}

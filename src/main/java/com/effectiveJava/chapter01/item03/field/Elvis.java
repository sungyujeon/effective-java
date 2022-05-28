package com.effectiveJava.chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    /**
     * singleton object - static final 방식
     *
     */
    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can't be created by constructor");
        }
        created = true;
    };

    @Override
    public void sing() {

    }

    private Object readResolve() {
        return INSTANCE;
    }

}

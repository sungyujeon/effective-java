package com.effectiveJava.chapter03.item17;

import java.math.BigInteger;

public final class Complex {

    private final double re;
    private final double im;

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(1, 0);

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return this.re;
    }

    public double imaginaryPart() {
        return this.im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }
    // ...

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }
}

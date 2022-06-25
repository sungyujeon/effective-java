package com.effectiveJava.chapter02.item11.hashcode;


import lombok.EqualsAndHashCode;

import java.util.Objects;

@EqualsAndHashCode
public class PhoneNumber {

    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

    // bad hashCode: 같은 값을 반환한다
//    @Override hashCode() {
//        return 42;
//    }

    // general hashCode
//    @Override
//    public int hashCode() {
//        int result = Short.hashCode(areaCode);
//        result = 31 * result + Short.hashCode(prefix);
//        result = 31 * result + Short.hashCode(lineNum);
//        return result;
//    }

    // Objects.hashCode
    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }

    public static void main(String[] args) {

    }


}

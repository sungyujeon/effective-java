package com.effectiveJava.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    /* fastpath if the regex is a
         (1)one-char String and this character is not one of the
            RegEx's meta characters ".$|()[{^?*+\\", or
         (2)two-char String and the first char is the backslash and
            the second is not the ascii digit or ascii letter.
    */
    // match, replace, replaceAll, replaceFirst etc..

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            String name = "hi,hello";
//            name.split(",");
            SPLIT_PATTERN.split(name);  // one-char String -> 오히려 느림
        }
        System.out.println((System.nanoTime() - start) / 1_000_000. + " ms");
    }
}

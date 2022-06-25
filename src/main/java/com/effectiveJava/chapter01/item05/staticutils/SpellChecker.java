package com.effectiveJava.chapter01.item05.staticutils;

import com.effectiveJava.chapter01.item05.DefaultDictionary;
import com.effectiveJava.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private static final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {}

    public static boolean isValid(String word) {
        // TODO SpellChecker
        return dictionary.contains(word);
    }

    public static List<String> suggestion(String typo) {
        // TODO SpellChecker
        return dictionary.closeWordsTo(typo);
    }
}

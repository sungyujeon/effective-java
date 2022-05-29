package com.effectiveJava.chapter01.item05.dependencyinjection;

import com.effectiveJava.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word) {
        // TODO SpellChecker
        return dictionary.contains(word);
    }

    public List<String> suggestion(String typo) {
        // TODO SpellChecker
        return dictionary.closeWordsTo(typo);
    }

}

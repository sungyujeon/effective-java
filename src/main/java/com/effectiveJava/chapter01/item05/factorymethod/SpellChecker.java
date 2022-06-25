package com.effectiveJava.chapter01.item05.factorymethod;

import com.effectiveJava.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
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

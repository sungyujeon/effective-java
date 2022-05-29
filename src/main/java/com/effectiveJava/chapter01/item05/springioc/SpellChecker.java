package com.effectiveJava.chapter01.item05.springioc;

import com.effectiveJava.chapter01.item05.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
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

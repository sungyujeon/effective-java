package com.effectiveJava.chapter01.item05.dependencyinjection;

import com.effectiveJava.chapter01.item05.DefaultDictionary;
import com.effectiveJava.chapter01.item05.MockDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(MockDictionary::new);
        spellChecker.isValid("test");

    }

    @Test
    void suggestion() {
    }
}
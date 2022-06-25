package com.effectiveJava.chapter01.item05.springioc;

import com.effectiveJava.chapter01.item05.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringDictionary implements Dictionary {

    @Override
    public boolean contains(String word) {
        System.out.println("spring conatins: " + word);
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        System.out.println("spring closeWordsTo: " + typo);
        return null;
    }
}

package com.effectiveJava.chapter01.item03.functionalinterface;

import com.effectiveJava.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {
        /* Function */
        //Function<Integer, String> intToString = (i) -> "my string";
        Function<Integer, String> intToString = Object::toString;


        /* Supplier -> no parameters */
        //Supplier<Person> personSupplier = () -> new Person();
        Supplier<Person> personSupplier = Person::new;  // 기본생성자 참조
        Function<LocalDate, Person> personFunction = Person::new;  // LocalDate를 파라미터로 갖는 생성자 ㅏㅊㅁ조


        /* Supplier -> void with parameter */
        Consumer<Integer> integerConsumer = System.out::println;


        /* Predicate -> return boolean */
        Predicate<Person> predicate;
    }
}

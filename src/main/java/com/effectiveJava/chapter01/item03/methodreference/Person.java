package com.effectiveJava.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    LocalDate birthday;

    public Person() {

    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2013, 1, 28)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));

//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person a, Person b) {
//                return a.birthday.compareTo(b.birthday);
//            }
//        });

        // 메서드 참조
        people.sort((a, b) -> compareByAge(a, b));
        people.sort(Person::compareByAge);
        people.stream().map(p -> p.birthday).forEach(System.out::println);

        // 생성자 참조
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982, 7, 15));
        dates.add(LocalDate.of(2013, 6, 15));
        dates.add(LocalDate.of(2022, 3, 15));
        dates.stream()
                .map(Person::new)
                .forEach(System.out::println);

    }
}
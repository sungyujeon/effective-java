package com.effectiveJava.chapter01.item01.reflection;

import java.lang.reflect.Constructor;

public class Client {

    /*
    * reflection
    * 클래스들은 JVM classLoader가 읽어들임
    *
    * */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.effectiveJava.chapter01.item01.flyweight.Font");
        Constructor<?> constructor = aClass.getConstructor();
//        System.out.println(constructor.);
        System.out.println(aClass.getAnnotations());


    }
}

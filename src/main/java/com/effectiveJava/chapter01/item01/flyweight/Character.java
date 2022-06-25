package com.effectiveJava.chapter01.item01.flyweight;

public class Character {

    private char value;

    private String color;

//    private String fontFamily;
//
//    private int fontSize;
    private Font font;

//    public Character(char value, String color, String fontFamily, int fontSize) {
public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
//        this.fontFamily = fontFamily;
//        this.fontSize = fontSize;
        this.font = font;
    }
}

package com.effectiveJava.chapter02.item10.stackoverflow;

import java.util.Objects;

/**
 * StackOverFlowError
 * stack & heap
 * 메서드 호출 시, 스택에 스택 프레임이 쌓임
 * stack frame >> 메서드에 전달하는 매개변수, 메서드 실행 끝나고 돌아갈 곳, 힙에 들어있는 객체에 대한 레퍼런스
 * 더 이상의 stack frame을 쌓을 수 없다면! stackOverFlowError
 */


public class App {

    public static void main(String[] args) {
        SmellPoint p1 = new SmellPoint(1, 0, "sweet");
        ColorPoint p2 = new ColorPoint(1, 0, "RED");

        p1.equals(p2); // StackOverFlowError 발생!
    }

}

class SmellPoint {

    private final int x;
    private final int y;
    private final String smell;

    public SmellPoint(int x, int y, String smell) {
        this.x = x;
        this.y = y;
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmellPoint)) {
//            return false;
            return o.equals(this);
        }
        SmellPoint that = (SmellPoint) o;
        return x == that.x && y == that.y && Objects.equals(smell, that.smell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, smell);
    }
}

class ColorPoint {

    private final int x;
    private final int y;
    private final String color;

    public ColorPoint(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) {
//            return false;
            return o.equals(this); // bad
        }
        ColorPoint that = (ColorPoint) o;
        return x == that.x && y == that.y && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}

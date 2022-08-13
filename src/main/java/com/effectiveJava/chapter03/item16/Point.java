package com.effectiveJava.chapter03.item16;

/**
 * public field로 선언하지 말고 private으로 최대한 제어 범위를 좁힌 뒤에
 * 해당 필드에 접근할 수 있는 메서드를 생성하여 유연성을 확보하라
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

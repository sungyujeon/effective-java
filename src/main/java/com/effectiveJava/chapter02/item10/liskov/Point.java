package com.effectiveJava.chapter02.item10.liskov;


import java.util.Set;

/**
 * Liskov Substitution Principle
 * 객체 지향 5대 원칙 SOLID 중에 하나
 * 1994년, 바바라 리스코프의 논문 "A Behavioral Notion of Subtyping"에서 기원한 객체 지향 원칙
 * '하위 클래스의 객체'가 '상위 클래스 객체'를 대체하더라도 소프트웨어의 기능을
 * 깨뜨리지 않아야 한다.(semantic over syntactic, 구문 보다는 의미)
 */

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static final Set<Point> unitCircle = Set.of(
            new Point(1, 0), new Point(0, 1)
    );

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    // 리스코프 치환 원칙 위배
    // equals 잘못 정의(getClass() 사용)할 시 onUnitCircle() 메서드에서
    // 해당 point 인스턴스가 하위 타입일 때는 false 리턴하여 리스코프 치환 원칙 위반
    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass())  // bad
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

}

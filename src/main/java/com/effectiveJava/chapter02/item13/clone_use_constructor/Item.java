package com.effectiveJava.chapter02.item13.clone_use_constructor;

public class Item implements Cloneable {

    private String name;

    /**
     * p.78 이렇게 구현하면 하위 클래스의 clone()이 깨질 수 있음
     * 생성자를 호출해서 clone을 구현하면 안되고, super.clone()을 호출해야 한다
     */
//    @Override
//    protected Item clone() {
//        Item item = new Item();
//        item.name = this.name;
//        return item;
//    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

}

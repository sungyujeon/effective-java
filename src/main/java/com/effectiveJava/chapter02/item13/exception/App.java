package com.effectiveJava.chapter02.item13.exception;

public class App {

    public void hello() {
        System.out.println("hello");
        throw new MyException();
    }

    public static void main(String[] args) {
        App app = new App();
        app.hello();  // unchecked exception은 예외 처리를 하지 않아도 됨

        try {
            app.hello();  // client가 예외가 발생할 수 있다는 것을 알 수 있다는 그 자체로 API 역할을 함
        } catch (Exception e) {

        }
    }
}

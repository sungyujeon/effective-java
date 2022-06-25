package com.effectiveJava.chapter01.item08.autocloseable;

public class App {

    public static void main(String[] args) throws Exception {
        try(AutoCloseableIsGood good = new AutoCloseableIsGood()) {
            // 자원 반납 처리
            // cleaner는 클라이언트에 의해 자원이 반납 안되더라도 gc 될 수 있는 기회를 줄 수 있게 안전망으로 사용
        }
    }
}

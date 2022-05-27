package com.effectiveJava.chapter01.item01.ServiceProvider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    /*
    * 서비스 제공자 프레임워크
    * 주요 구성 요소
    * - 서비스 제공자 인터페이스(SPI)와 서비스 제공자(서비스 구현체)
    * - 서비스 제공자 등록 API(서비스 인터페이스의 구현체를 등록하는 방법)
    * - 서비스 접근 API(서비스의 클리이언트가 서비스 인터페이스의 인스턴스를 가져올 때 사용하는 API)
    *
    * 다양한 변형
    * - 브릿지 패턴
    * - 의존 객체 주입 프레임워크
    * - java.util.ServiceLoader
    *
    * TODO 서비스 제공자 프레임워크 어려워..
    * */

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = applicationContext.getBean(HelloService.class);
        System.out.println(helloService.hello());
    }
}

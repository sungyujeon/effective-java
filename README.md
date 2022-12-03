# 이펙티브 자바 스터디

> 2022\. 05. 28 ~

<br>

## 학습내용

##### 1장 들어가기

##### 2장 객체 생성과 파괴

- [ITEM01. 생성자 대신 정적 팩터리 메서드를 고려하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-01.-생성자-대신-정적-팩터리-메서드를-고려하라)
- [ITEM02. 생성자에 매개변수가 많다면 빌더를 고려하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-02.-생성자에-매개변수가-많다면-빌더를-고려하라)
- [ITEM03. private 생성자나 열거 타입으로 싱글턴임을 보증하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-03.-private-생성자나-열거-타입으로-싱글턴임을-보증하라)
- [ITEM04. 인스턴스화를 막으려거든 private 생성자를 사용하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-04.-인스턴스화를-막으려거든-private-생성자를-사용하라)
- [ITEM05. 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-05.-자원을-직접-명시하지-말고-의존-객체-주입을-사용하라)
- [ITEM06. 불필요한 객체 생성을 피하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-06.-불필요한-객체-생성을-피하라)
- [ITEM07. 다 쓴 객체 참조를 해제하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-07.-다-쓴-객체-참조를-해제하라)
- [ITEM08. finalizer와 cleaner 사용을 피하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-08.-finalizer와-cleaner-사용을-피하라)
- [ITEM09. try-finally 보다는 try-with-resources를 사용하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/01_creating-destroying-objects.md/#ITEM-09.-try-finally-보다는-try-with-resources를-사용하라)

##### 3장 모든 객체의 공통 메서드

- [ITEM10. equals는 일반 규약을 지켜 재정의하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/02_methods-common-to-all-objects.md/#ITEM-10.-equals는-일반-규약을-지켜-재정의하라)
- [ITEM11. equals를 재정의하려거든 hashCode도 재정의하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/02_methods-common-to-all-objects.md/#ITEM-11.-equals를-재정의하려거든-hashCode도-재정의하라)
- [ITEM12. toString을 항상 재정의하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/02_methods-common-to-all-objects.md/#ITEM12.-toString을-항상-재정의하라)
- [ITEM13. clone 재정의는 주의해서 진행하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/02_methods-common-to-all-objects.md/#ITEM-13.-clone-재정의는-주의해서-진행하라)
- [ITEM14. Comparable을 구현할지 고려하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/02_methods-common-to-all-objects.md/#ITEM-14.-Comparable을-구현할지-고려하라)

##### 4장 클래스와 인터페이스

- [ITEM 15. 클래스와 멤버의 접근 권한을 최소화하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-15.-클래스와-멤버의-접근-권한을-최소화하라)
- [ITEM 16. public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-16.-public-클래스에서는-public-필드가-아닌-접근자-메서드를-사용하라)
- [ITEM 17. 변경 가능성을 최소화하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-17.-변경-가능성을-최소화하라)
- [ITEM 18. 상속보다는 컴포지션을 사용하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-18.-상속보다는-컴포지션을-사용하라)
- [ITEM 19. 상속을 고려해 설계하고 문서화하라. 그러지 않았다면 상속을 금지하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-19.-상속을-고려해-설계하고-문서화하라.-그러지-않았다면-상속을-금지하라)
- [ITEM 20. 추상 클래스보다는 인터페이스를 우선하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-20.-추상-클래스보다는-인터페이스를-우선하라)
- [ITEM 21. 인터페이스는 구현하는 쪽을 생각해 설계하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-21.-인터페이스는-구현하는-쪽을-생각해-설계하라)
- [ITEM 22. 인터페이스는 타입을 정의하는 용도로만 사용하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-22.-인터페이스는-타입을-정의하는-용도로만-사용하라)
- [ITEM 23. 태그 달린 클래스보다는 클래스 계층구조를 활용하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-23.-태그-달린-클래스보다는-클래스-계층구조를-활용하라)
- [ITEM 24. 멤버 클래스는 되도록 static으로 만들라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-24.-멤버-클래스는-되도록-static으로-만들라)
- [ITEM 25. 톱레벨 클래스는 한 파일에 하나만 담으라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/03_classes-and-interfaces.md/#ITEM-25.-톱레벨-클래스는-한-파일에-하나만-담으라)

##### 5장 제네릭

- [ITEM 26. RAW 타입은 사용하지 말라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/04_generics.md/#ITEM-26.-RAW-타입은-사용하지-말라)
- [ITEM 27. 비검사 경고를 제거하라](https://github.com/sungyujeon/TIL/blob/master/java/effective-java/04_generics.md/#ITEM-27.-비검사-경고를-제거하라)

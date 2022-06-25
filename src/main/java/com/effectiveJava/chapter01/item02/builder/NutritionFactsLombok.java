package com.effectiveJava.chapter01.item02.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * Builder
 * 단점1. builder 사용하면 모든 매개변수를 받는 생성자가 생김
 * - @AllArgsConstructor로 외부에서 생성자를 못 쓰고 빌더만 사용 가능
 * 단점2. 필수 생성자를 지정할 수 없음
 * - Lombok @Builder에는 아직 기능이 없음
 */

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NutritionFactsLombok {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        NutritionFactsLombok nutritionFacts = new NutritionFactsLombokBuilder()
                .servings(10)
                .build();

        nutritionFacts.test();
    }

    public void test() {
        System.out.println("hi");
    }
}

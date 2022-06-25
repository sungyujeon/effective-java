package com.effectiveJava.chapter01.item06;

public class Deprecation {

    /**
     * @deprecated 해당 API 사용을 지양하며, 대신에 권장하는 API가 어떤 것인지 설명
     * in favor of {@link #Deprecation(String)}
     */
    @Deprecated(forRemoval = true, since = "1.2")
    public Deprecation() {

    }

    private String name;

    public Deprecation(String name) {
        this.name = name;
    }
}

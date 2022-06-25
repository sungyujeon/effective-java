package com.effectiveJava.chapter01.item08.finalizer_attack;

import java.math.BigDecimal;

// finalize attack을 막기 위해
// 1.final class로 만들 수 있음
// 2. finalize를 overriding 한 뒤 final로 선언
public class Account {

    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;

        if (accountId.equals("푸틴")) {
            throw new IllegalArgumentException("푸틴은 계정을 막습니다.");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }

    @Override
    protected final void finalize() throws Throwable {

    }
}

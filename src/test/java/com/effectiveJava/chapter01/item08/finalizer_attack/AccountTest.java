package com.effectiveJava.chapter01.item08.finalizer_attack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void 일반_계정() {
        Account account = new Account("sun");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

    @Test
    void 푸틴_계정() {
        Account account = new Account("푸틴");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

    @Test
    void attackPutinAccount() throws InterruptedException {
        Account account = null;
        try {
            account = new BrokenAccount("푸틴");
        } catch (Exception e) {
            System.out.println("broken account call");
        }

        System.gc();
        Thread.sleep(3000L);

        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

}
package com.effectiveJava.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        Optional<Membership> optionalMembership = channel.defaultMembership();

        optionalMembership.ifPresent(Membership::hello);

        // error
        // Membership membership = optionalMembership.get(); >> ifPresent 사용
        // membership.hello();
    }
}
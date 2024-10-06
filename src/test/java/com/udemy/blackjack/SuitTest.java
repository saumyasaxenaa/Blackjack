package com.udemy.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {


    @Test
    void heartPrintsHeart() {
        assertEquals("♥", Suit.HEARTS.toString());
    }
}
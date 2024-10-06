package com.udemy.blackjack;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);


    private int value;

    Rank(int value) {
        this.value = value;
    }
    // Rank KING = new Rank("KING");
    // Rank QUEEN = new Rank("QUEEN");
    // Rank JACK = new Rank("JACK");

    public int getValue() {
        switch (this) {
            case JACK:
            case QUEEN:
            case KING:
                return 10;
            default:
                return ordinal() + 1;
        }
    }
}

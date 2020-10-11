package working_wit_abstraction.exercises.cards_with_power;

public enum CardRank {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int rank;

    CardRank (int rank) {
        this.rank = rank;

    }

    public String elementToString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.toString());
    }

    public static int getRankPower(String rank) {
        return CardRank.valueOf(rank).rank;

    }
    
}

package working_wit_abstraction.exercises.cards_deck;

public enum CardRank {
    ACE(0),
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12);

    private final int rank;

    CardRank (int rank) {
        this.rank = rank;
    }

    public String elementToString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.toString());
    }
    
}

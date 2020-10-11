package working_wit_abstraction.exercises.cards_deck;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    CardSuit(int power) {
        this.power = power;
    }

 public String elementToString() {
     return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.toString());
 }
}

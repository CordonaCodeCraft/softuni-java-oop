package working_wit_abstraction.exercises.cards_with_power;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    CardSuit (int power) {
        this.power = power;
    }

 public String elementToString() {
     return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.toString());
 }

 public static int getTypePower(String type) {
        return CardSuit.valueOf(type).power;
 }
}

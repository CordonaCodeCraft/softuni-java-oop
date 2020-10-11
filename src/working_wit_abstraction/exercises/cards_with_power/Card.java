package working_wit_abstraction.exercises.cards_with_power;

public class Card {
   private final CardSuit suit;
   private final CardRank rank;

   public Card(CardSuit suit, CardRank rank) {
       this.suit = suit;
       this.rank = rank;
   }


   public int calculatePower() {
       return CardSuit.getTypePower(suit.toString()) + CardRank.getRankPower(rank.toString());

   }

}

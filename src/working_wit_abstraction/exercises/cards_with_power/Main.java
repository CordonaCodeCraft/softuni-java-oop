// Judge ready

package working_wit_abstraction.exercises.cards_with_power;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rank = s.nextLine();
        String type = s.nextLine();
        Card card = new Card(CardSuit.valueOf(type), CardRank.valueOf(rank));
        System.out.println();

        int cardPower = card.calculatePower();
        System.out.printf("Card name: %s of %s; Card power: %d", rank, type, cardPower);

    }
}

package working_wit_abstraction.exercises.cards_deck;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.printf("%s:%n",input);

        Arrays
                .stream(CardRank.values())
                .forEach(cardSuit -> System.out.println(cardSuit.elementToString()));
    }
}

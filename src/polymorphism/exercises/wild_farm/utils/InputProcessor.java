package polymorphism.exercises.wild_farm.utils;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class InputProcessor {

    public static Deque<String[]> parseTokens() {

        Deque<String[]> tokens = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            } else {
                String[] element = input.split("\\s+");
                tokens.offer(element);
            }
        }

        return tokens;
    }
}

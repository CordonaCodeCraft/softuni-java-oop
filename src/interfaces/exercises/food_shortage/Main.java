package interfaces.exercises.food_shortage;

import interfaces.exercises.food_shortage.interfaces.Buyer;
import interfaces.exercises.food_shortage.objects.Citizen;
import interfaces.exercises.food_shortage.objects.Rebel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Buyer> BUYERS = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int buyersCount = Integer.parseInt(scanner.nextLine());

        while (--buyersCount >= 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            if (tokens.length == 4) {
                String id = tokens[2];
                String birthDate = tokens[3];
                BUYERS.putIfAbsent(name, new Citizen(name, age, id, birthDate));
            } else {
                String group = tokens[2];
                BUYERS.putIfAbsent(name, new Rebel(name, age, group));
            }
        }

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("End")) {
                break;
            } else {
                if (BUYERS.containsKey(name)) {
                    BUYERS.get(name).buyFood();
                }
            }
        }

        int foodTotal = BUYERS
                .values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();

        System.out.println(foodTotal);

    }
}

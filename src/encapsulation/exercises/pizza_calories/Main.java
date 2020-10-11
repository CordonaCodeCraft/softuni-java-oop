package encapsulation.exercises.pizza_calories;

import encapsulation.exercises.pizza_calories.ingredients.Dough;
import encapsulation.exercises.pizza_calories.ingredients.Topping;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza = generatePizza(scanner);

        if (isValidObject(pizza)) {
            Dough dough = generateDough(scanner);
            if (isValidObject(dough)) {
                pizza.setDough(dough);

                boolean canAddAllToppings = addTopping(pizza, scanner);

                if (canAddAllToppings) {
                    System.out.printf("%s - %.2f",pizza.getName(),pizza.getOverallCalories());
                }
            }
        }

    }

    private static Pizza generatePizza(Scanner input) {
        String[] tokens = input.nextLine().split(" ");

        String pizzaName = tokens[1];
        int toppingsCount = Integer.parseInt(tokens[2]);

        try {
            return new Pizza(pizzaName, toppingsCount);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    private static Dough generateDough(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");

        String flourType = tokens[1];
        String bakingTechnique = tokens[2];
        double weight = Double.parseDouble(tokens[3]);

        try {
            return new Dough(flourType, bakingTechnique, weight);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    private static boolean addTopping(Pizza pizza, Scanner scanner) {

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            } else {
                String[] toppingTokens = input.split("\\s+");

                String toppingType = toppingTokens[1];
                double toppingWeight = Double.parseDouble(toppingTokens[2]);

                try {
                    pizza.addTopping(new Topping(toppingType, toppingWeight));
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                    return false;
                }

            }
        }
        return true;
    }

    private static boolean isValidObject(Object object) {
        return object != null;

    }
}


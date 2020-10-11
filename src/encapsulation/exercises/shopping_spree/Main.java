package encapsulation.exercises.shopping_spree;

import java.util.*;

public class Main {
    private static final Map<String, Person> PERSONS = new LinkedHashMap<>();
    private static final Map<String, Product> PRODUCTS = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        createPersons(scanner.nextLine());
        createProducts(scanner.nextLine());

        while (true) {                             
            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            } else {
                String[] tokens = input.split("\\s+");
                String personName = tokens[0];
                String productName = tokens[1];

                if (PERSONS.containsKey(personName)) {
                    PERSONS.get(personName).buyProduct(PRODUCTS.get(productName));
                }

            }
        }
        for (String person : PERSONS.keySet()) {
            System.out.println(PERSONS.get(person).toString());
        }
    }

    private static void createProducts(String input) {
        String[] inputTokens = input.split(";");

        for (String token : inputTokens) {
            String[] productTokens = token.split("=");
            String name = productTokens[0];
            double cost = Double.parseDouble(productTokens[1]);

            try {
                Product product = new Product(name, cost);
                PRODUCTS.putIfAbsent(name, product);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private static void createPersons(String input) {
        String[] inputTokens = input.split(";");

        for (String token : inputTokens) {
            String[] personTokens = token.split("=");
            String name = personTokens[0];
            double money = Double.parseDouble(personTokens[1]);

            try {
                Person person = new Person(name, money);
                PERSONS.putIfAbsent(name, person);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}

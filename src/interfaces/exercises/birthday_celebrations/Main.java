package interfaces.exercises.birthday_celebrations;

import interfaces.exercises.birthday_celebrations.interfaces.Birthable;
import interfaces.exercises.birthday_celebrations.objects.Citizen;
import interfaces.exercises.birthday_celebrations.objects.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Birthable> BIRTHABLES = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            } else {
                boolean isBirthable = input.contains("Citizen") || input.contains("Pet");

                if (isBirthable) {
                    addObjectToList(input);
                }
            }
        }

        String year = scanner.nextLine();

        BIRTHABLES
                .stream()
                .map(Birthable::getBirthDate)
                .filter(d -> d.contains(year))
                .forEach(System.out::println);

    }

    private static void addObjectToList(String input) {
        String[] tokens = input.split("\\s+");

        String objectType = tokens[0];
        String name = tokens[1];
        String birthDate = tokens[tokens.length - 1];

        switch (objectType) {

            case "Citizen":
                int age = Integer.parseInt(tokens[2]);
                String id = tokens[3];
                BIRTHABLES.add(new Citizen(name, age, id, birthDate));
                break;

            case "Pet":
                BIRTHABLES.add(new Pet(name, birthDate));
        }
    }
}

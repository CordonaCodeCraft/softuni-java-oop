package inheritance.exercises.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Animal> ANIMALS = new ArrayList<>();
    private static String animalType = "";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Beast!")) {
                break;
            } else {
                String[] tokens = input.split("\\s+");

                boolean isAnimalType = tokens.length == 1;

                if (isAnimalType) {
                    animalType = tokens[0];
                } else {
                    if (tokens.length == 3) {
                        addAnimalToList(tokens);
                    }
                }
            }
        }

        ANIMALS
                .forEach(animal -> System.out.printf("%s%n%s%n", animal.toString(), animal.produceSound()));


    }

    private static void addAnimalToList(String[] tokens) {
        String name = tokens[0];
        Integer age = Integer.parseInt(tokens[1]);
        String gender = tokens[2];

        if (age < 0) {
            System.out.println("Invalid input!");
        } else {
            switch (animalType) {
                case "Cat":
                    ANIMALS.add(new Cat(name, age, gender));
                    break;
                case "Dog":
                    ANIMALS.add(new Dog(name, age, gender));
                    break;
                case "Frog":
                    ANIMALS.add(new Frog(name, age, gender));
                    break;
                case "Kitten":
                    ANIMALS.add(new Kitten(name, age, gender));
                    break;
                case "Tomcat":
                    ANIMALS.add(new Tomcat(name, age, gender));
                    break;
            }
        }
    }
}

package polymorphism.exercises.wild_farm.utils;

import polymorphism.exercises.wild_farm.entities.animals.*;
import polymorphism.exercises.wild_farm.entities.foods.Meat;
import polymorphism.exercises.wild_farm.entities.foods.Vegetable;
import polymorphism.exercises.wild_farm.repository.Repository;

import java.util.Deque;

public class ObjectFactory {

    private ObjectFactory() {
    }

    public static void processTokens(Deque<String[]> tokens) {

        while (!tokens.isEmpty()) {

            String[] animalTokens = tokens.remove();
            String[] foodTokens = tokens.remove();

            constructAnimal(animalTokens);

            constructFood(foodTokens);

        }

    }

    public static void constructAnimal(String[] tokens) {

        String type = tokens[0];
        String name = tokens[1];
        Double weight = Double.parseDouble(tokens[2]);
        String livingRegion = tokens[3];

        if (type.equals("Cat")) {
            String catBreed = tokens[4];
            Animal cat = new Cat(type, name, weight, livingRegion, catBreed);
            cat.makeSound();
            Repository.addNewAnimal(cat);
        } else {
            switch (type) {
                case "Mouse":
                    Animal mouse = new Mouse(type, name, weight, livingRegion);
                    mouse.makeSound();
                    Repository.addNewAnimal(mouse);
                    break;
                case "Zebra":
                    Animal zebra = new Zebra(type, name, weight, livingRegion);
                    zebra.makeSound();
                    Repository.addNewAnimal(zebra);
                    break;
                case "Tiger":
                    Animal tiger = new Tiger(type, name, weight, livingRegion);
                    tiger.makeSound();
                    Repository.addNewAnimal(tiger);
                    break;
            }

        }

    }

    public static void constructFood(String[] tokens) {
        String type = tokens[0];
        Integer quantity = Integer.parseInt(tokens[1]);

        switch (type) {
            case "Vegetable":
                Repository.addNewFood(new Vegetable(quantity));
                break;
            case "Meat":
                Repository.addNewFood(new Meat(quantity));
                break;
        }
    }

}

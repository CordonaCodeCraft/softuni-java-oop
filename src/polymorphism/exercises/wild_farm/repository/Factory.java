package polymorphism.exercises.wild_farm.repository;

import polymorphism.exercises.wild_farm.repository.entities.animals.Cat;
import polymorphism.exercises.wild_farm.repository.entities.animals.Mouse;
import polymorphism.exercises.wild_farm.repository.entities.animals.Tiger;
import polymorphism.exercises.wild_farm.repository.entities.animals.Zebra;
import polymorphism.exercises.wild_farm.repository.entities.foods.Meat;
import polymorphism.exercises.wild_farm.repository.entities.foods.Vegetable;

import java.util.Deque;

public class Factory {

    private Factory() {
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
            Repository.addNewAnimal(new Cat(type, name, weight, livingRegion, catBreed));
        } else {
            switch (type) {
                case "Mouse":
                    Repository.addNewAnimal(new Mouse(type, name, weight, livingRegion));
                    break;
                case "Zebra":
                    Repository.addNewAnimal(new Zebra(type, name, weight, livingRegion));
                    break;
                case "Tiger":
                    Repository.addNewAnimal(new Tiger(type, name, weight, livingRegion));
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

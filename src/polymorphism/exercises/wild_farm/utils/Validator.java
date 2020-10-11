package polymorphism.exercises.wild_farm.utils;

import polymorphism.exercises.wild_farm.repository.entities.animals.Animal;
import polymorphism.exercises.wild_farm.repository.entities.foods.Food;

public class Validator {

    public static boolean validateFood(Animal animal, Food food) {

        String animalType = animal.getClass().getSimpleName();
        String foodType = food.getClass().getSimpleName();

        return true;
    }
}

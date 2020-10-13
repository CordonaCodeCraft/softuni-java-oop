package polymorphism.exercises.wild_farm.utils;

import polymorphism.exercises.wild_farm.entities.animals.Animal;
import polymorphism.exercises.wild_farm.entities.foods.Food;

public class Validator {

    public static boolean validateFood(Animal animal, Food food) {
        boolean isValidFood = true;

        String animalType = animal.getClass().getSimpleName();
        String foodType = food.getClass().getSimpleName();

        if (animalType.equals("Tiger") && foodType.equals("Vegetable")) {
            Validator.printErrorMessage(animalType);
            isValidFood = false;
        } else if (animalType.equals("Mouse") && foodType.equals("Meat")) {
            Validator.printErrorMessage(animalType);
            isValidFood = false;
            Validator.printErrorMessage(animalType);
        } else if (animalType.equals("Zebra") && foodType.equals("Meat")) {
            isValidFood = false;
        }

        return isValidFood;
    }

    private static void printErrorMessage(String animal) {
        System.out.println(String.format("%s are not eating that type of food!", animal));
    }
}

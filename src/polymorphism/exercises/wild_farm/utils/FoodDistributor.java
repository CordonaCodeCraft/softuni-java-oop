package polymorphism.exercises.wild_farm.utils;

import polymorphism.exercises.wild_farm.repository.Repository;
import polymorphism.exercises.wild_farm.repository.entities.animals.Animal;
import polymorphism.exercises.wild_farm.repository.entities.foods.Food;

public class FoodDistributor {

    private FoodDistributor() {
    }

    public static void distributeFood() {

        int animalsCount = Repository.getAnimals().size();

        for (int i = 0; i < animalsCount; i++) {
            Animal animal = Repository.getAnimals().get(i);
            Food food = Repository.getFoods().get(i);
            boolean isValidFood = Validator.validateFood(animal, food);

        }

    }

}

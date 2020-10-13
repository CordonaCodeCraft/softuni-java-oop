package polymorphism.exercises.wild_farm.repository;

import polymorphism.exercises.wild_farm.entities.animals.Animal;
import polymorphism.exercises.wild_farm.entities.foods.Food;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private final static List<Animal> animals = new ArrayList<>();
    private final static List<Food> foods = new ArrayList<>();

    public static List<Animal> getAnimals() {
        return animals;
    }

    public static List<Food> getFoods() {
        return foods;
    }

    public static void addNewAnimal(Animal animal) {
        animals.add(animal);
    }

    public static void addNewFood(Food food) {
        foods.add(food);
    }
}

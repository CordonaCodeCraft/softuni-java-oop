package polymorphism.exercises.wild_farm.repository.entities.animals;

import polymorphism.exercises.wild_farm.repository.entities.foods.Food;

public abstract class Animal {

    private final String type;
    private final String name;
    private final Double weight;
    private Integer foodEaten;

    public Animal(String type, String name, Double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

}

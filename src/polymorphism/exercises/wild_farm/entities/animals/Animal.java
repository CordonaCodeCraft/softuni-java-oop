package polymorphism.exercises.wild_farm.entities.animals;

import polymorphism.exercises.wild_farm.entities.foods.Food;

public abstract class Animal {

    private final String type;
    private final String name;
    private final Double weight;
    private Integer foodEaten;

    public Animal(String type, String name, Double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.foodEaten = 0;
    }

    public void eat(Food food) {
        foodEaten += food.getQuantity();
        System.out.println();
    }

    public abstract void makeSound();

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Integer getFoodEaten() {
        return this.foodEaten;
    }
}

package polymorphism.exercises.wild_farm.repository.entities.animals;

import polymorphism.exercises.wild_farm.repository.entities.foods.Food;

public class Cat extends Felime {

    private final String breed;

    public Cat(String type, String name, Double weight, String livingRegion, String breed) {
        super(type, name, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {

    }
}

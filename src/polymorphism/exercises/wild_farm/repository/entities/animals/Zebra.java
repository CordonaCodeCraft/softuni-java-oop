package polymorphism.exercises.wild_farm.repository.entities.animals;

import polymorphism.exercises.wild_farm.repository.entities.foods.Food;

public class Zebra extends Mammal {

    public Zebra(String type, String name, Double weight, String livingRegion) {
        super(type, name, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        
    }

    @Override
    public void eat(Food food) {

    }
}

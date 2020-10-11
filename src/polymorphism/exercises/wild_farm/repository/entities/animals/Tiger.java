package polymorphism.exercises.wild_farm.repository.entities.animals;

import polymorphism.exercises.wild_farm.repository.entities.foods.Food;

public class Tiger extends Felime {

    private final String livingRegion;

    public Tiger(String type, String name, Double weight, String livingRegion) {
        super(type, name, weight, livingRegion);
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {

    }
}

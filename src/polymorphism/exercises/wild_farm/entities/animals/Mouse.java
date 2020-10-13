package polymorphism.exercises.wild_farm.entities.animals;

import polymorphism.exercises.wild_farm.entities.foods.Food;

public class Mouse extends Mammal {

    public Mouse(String type, String name, Double weight, String livingRegion) {
        super(type, name, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.print("SQUEEEAAAK!");
    }


}

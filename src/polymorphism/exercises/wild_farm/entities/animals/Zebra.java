package polymorphism.exercises.wild_farm.entities.animals;

public class Zebra extends Mammal {

    public Zebra(String type, String name, Double weight, String livingRegion) {
        super(type, name, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.print("Zs");
    }
}

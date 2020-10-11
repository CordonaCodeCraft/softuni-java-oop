package polymorphism.exercises.wild_farm.repository.entities.animals;

public abstract class Mammal extends Animal {

    private final String livingRegion;

    public Mammal(String type, String name, Double weight, String livingRegion) {
        super(type, name, weight);
        this.livingRegion = livingRegion;
    }

}

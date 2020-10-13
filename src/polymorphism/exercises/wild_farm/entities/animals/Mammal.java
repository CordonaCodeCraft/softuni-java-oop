package polymorphism.exercises.wild_farm.entities.animals;

public abstract class Mammal extends Animal {

    private final String livingRegion;

    public Mammal(String type, String name, Double weight, String livingRegion) {
        super(type, name, weight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %.2f, %s, %d]",
                this.getType(),
                this.getName(),
                this.getWeight(),
                this.livingRegion,
                this.getFoodEaten());
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }
}

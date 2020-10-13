package polymorphism.exercises.wild_farm.entities.animals;

public class Cat extends Felime {

    private final String breed;

    public Cat(String type, String name, Double weight, String livingRegion, String breed) {
        super(type, name, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.print("Meowwww");
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %.2f, %s, %d]",
                this.getType(),
                this.getName(),
                this.breed,
                this.getWeight(),
                this.getLivingRegion(),
                this.getFoodEaten());
    }

}

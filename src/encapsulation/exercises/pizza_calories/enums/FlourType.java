package encapsulation.exercises.pizza_calories.enums;

public enum FlourType {

    WHITE(1.5),
    WHOLEGRAIN(1.0);

    private final double modifier;


    FlourType(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return this.modifier;
    }

    @Override
    public String toString() {
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }

}

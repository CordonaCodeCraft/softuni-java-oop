package encapsulation.exercises.pizza_calories.enums;

public enum ToppingType {
    
    MEAT(1.2),
    VEGGIES(0.8),
    CHEESE(1.1),
    SAUCE(0.9);

    private final double modifier;

    ToppingType(double modifier) {
        this.modifier = modifier;

    }

    @Override
    public String toString() {
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();

    }

    public double getModifier() {
        return this.modifier;
    }
}

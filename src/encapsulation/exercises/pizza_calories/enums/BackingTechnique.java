package encapsulation.exercises.pizza_calories.enums;

public enum BackingTechnique {

    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    private final double modifier;

    BackingTechnique(double modifier) {
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

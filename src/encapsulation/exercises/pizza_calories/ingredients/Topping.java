package encapsulation.exercises.pizza_calories.ingredients;

import encapsulation.exercises.pizza_calories.enums.ToppingType;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);

    }

    private void setToppingType(String toppingType) {
        try {
            this.toppingType = ToppingType.valueOf(toppingType.toUpperCase()).toString();
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double toppingModifier = ToppingType.valueOf(this.toppingType.toUpperCase()).getModifier();
        return (2 * this.weight) * toppingModifier;

    }
}

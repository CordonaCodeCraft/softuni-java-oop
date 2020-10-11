package encapsulation.exercises.pizza_calories.ingredients;

import encapsulation.exercises.pizza_calories.enums.BackingTechnique;
import encapsulation.exercises.pizza_calories.enums.FlourType;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        try {
            this.flourType = FlourType.valueOf(flourType.toUpperCase()).toString();
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Invalid type of dough");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        try {
            this.bakingTechnique = BackingTechnique.valueOf(bakingTechnique.toUpperCase()).toString();
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Invalid type of baking technique");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        } else {
            this.weight = weight;
        }
    }

    public double calculateCalories() {
        double flourModifier = FlourType.valueOf(this.flourType.toUpperCase()).getModifier();
        double backingTechniqueModifier = BackingTechnique.valueOf(this.bakingTechnique.toUpperCase()).getModifier();

        return (2 * this.weight) * flourModifier * backingTechniqueModifier;
    }
}

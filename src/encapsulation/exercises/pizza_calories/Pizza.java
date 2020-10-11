package encapsulation.exercises.pizza_calories;

import encapsulation.exercises.pizza_calories.ingredients.Dough;
import encapsulation.exercises.pizza_calories.ingredients.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    public String getName() {
        return this.name;

    }

    private void setName(String name) {
        if (name.isBlank() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        } else {
            this.name = name;

        }

    }

    public void setDough(Dough dough) {
        this.dough = dough;

    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10]");
        } else {
            this.toppings = new ArrayList<>();
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double doughTotalCalories = this.dough.calculateCalories();
        double toppingsTotalCalories = this.toppings
                .stream()
                .map(Topping::calculateCalories)
                .reduce(0.0, Double::sum);

        return doughTotalCalories + toppingsTotalCalories;

    }
}

package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Beverages extends Product {
   private final Double milliliters;


    public Beverages(String name, BigDecimal price, Double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public Double getMilliliters() {
        return this.milliliters;
    }
}

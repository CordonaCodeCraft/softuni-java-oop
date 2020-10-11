package encapsulation.exercises.shopping_spree;

public class Product {
    private String name;
    private double cost;
                                              
    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }                                                                             

    public String getName() {
        return this.name;
    }

    private void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}

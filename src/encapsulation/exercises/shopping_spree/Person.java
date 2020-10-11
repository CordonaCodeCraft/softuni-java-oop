package encapsulation.exercises.shopping_spree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private final List<Product> products;
    private String name;
    private double money;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }



    private void setName(String name) {
        if (name.isBlank()) {
             throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {
        String productName = product.getName();
        double cost = product.getCost();

        boolean cannotBuyProduct = this.money < cost;

        if (cannotBuyProduct) {    
            System.out.printf("%s can't afford %s%n", this.name, productName);
        } else {
            this.products.add(product);
            System.out.printf("%s bought %s%n", this.name, productName);
            this.money -= cost;
        }
    }

    @Override
    public String toString() {

        String purchasedProducts = products.isEmpty() ? "Nothing bought" : this.products
                .stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));      

        return String.format("%s - %s", this.name, purchasedProducts);

    }
}

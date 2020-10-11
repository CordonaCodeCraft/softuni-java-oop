package interfaces.exercises.food_shortage.objects;

import interfaces.exercises.food_shortage.interfaces.Buyer;
import interfaces.exercises.food_shortage.interfaces.Identifiable;

public class Citizen implements Buyer, Identifiable {

    private final String name;
    private final int age;
    private final String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

}

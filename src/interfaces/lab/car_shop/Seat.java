package interfaces.lab.car_shop;

public class Seat extends Car {

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        super(model, color, horsePower, countryProduced);
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(),
                this.countryProduced(),
                TIRES);
    }
}

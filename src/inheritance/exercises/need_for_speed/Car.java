package inheritance.exercises.need_for_speed;

public class Car extends Vehicle {
    private static final Double DEFAULT_FUEL_CONSUMPTION = 3.0;

    public Car(Double fuel, Integer horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}

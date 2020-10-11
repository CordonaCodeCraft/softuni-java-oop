package inheritance.exercises.need_for_speed;

public class SportCar extends Car {
    private final static Double DEFAULT_FUEL_CONSUMPTION = 10.0;

    public SportCar(Double fuel, Integer horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}

package inheritance.exercises.need_for_speed;

public class RaceMotorcycle extends Motorcycle {
    private static final Double DEFAULT_FUEL_CONSUMPTION = 8.0;

    public RaceMotorcycle(Double fuel, Integer horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}

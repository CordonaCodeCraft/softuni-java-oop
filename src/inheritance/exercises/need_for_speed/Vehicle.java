package inheritance.exercises.need_for_speed;

public class Vehicle {
    private static final Double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private Double fuelConsumption;
    private Double fuel;
    private Integer horsePower;

    public Vehicle(Double fuel, Integer horsePower) {
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public void drive(Double kilometers) {
        double consumedFuel = kilometers * this.fuelConsumption;

        boolean canDrive = this.fuel >= consumedFuel;

        if (canDrive) {
            this.fuel -= consumedFuel;
        }
    }


    public Double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Double getFuel() {
        return this.fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}

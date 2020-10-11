package polymorphism.exercises.vehicles_extended.entities;

import polymorphism.exercises.vehicles_extended.utils.Validator;

public class Truck extends Vehicle {

    public Truck(double fuelReserve, double fuelConsumption, double tankCapacity) {
        super(fuelReserve, fuelConsumption, tankCapacity);
    }

    @Override
    public void refuel(double quantity) {

        double fuelLost = quantity * 5 / 100;
        double actualFuelRefill = quantity - fuelLost;

        boolean isValidQuantity = Validator.validateRefuelQuantity(this.getFuelReserve(), this.getTankCapacity(), actualFuelRefill);

        if (isValidQuantity) {
            this.setFuelReserve(actualFuelRefill + this.getFuelReserve());
        }

    }

    @Override
    public double getActualFuelConsumption() {

        if (this.getAirConditionerMode().toString().equals("ON")) {
            return this.getFuelConsumption() + 1.6;
        } else {
            return this.getFuelConsumption();
        }
    }
}

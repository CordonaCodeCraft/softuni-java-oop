package polymorphism.exercises.vehicles_extended.entities;

import polymorphism.exercises.vehicles_extended.utils.Validator;

public class Car extends Vehicle {

    public Car(double fuelReserve, double fuelConsumption, double tankCapacity) {
        super(fuelReserve, fuelConsumption, tankCapacity);
    }

    @Override
    public void refuel(double quantity) {

        boolean isValidQuantity = Validator.validateRefuelQuantity(this.getFuelReserve(), this.getTankCapacity(), quantity);

        if (isValidQuantity) {
            this.setFuelReserve(quantity + this.getFuelReserve());
        }
    }

    @Override
    public double getActualFuelConsumption() {

        if (this.getAirConditionerMode().toString().equals("ON")) {
            return this.getFuelConsumption() + 0.9;
        } else {
            return this.getFuelConsumption();
        }
    }
}

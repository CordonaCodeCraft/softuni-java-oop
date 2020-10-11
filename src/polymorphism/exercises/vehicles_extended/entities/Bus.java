package polymorphism.exercises.vehicles_extended.entities;

import polymorphism.exercises.vehicles_extended.enums.BusMode;
import polymorphism.exercises.vehicles_extended.utils.Validator;

public class Bus extends Vehicle {
    private BusMode busMode;

    public Bus(double fuelReserve, double fuelConsumption, double tankCapacity) {
        super(fuelReserve, fuelConsumption, tankCapacity);
        this.busMode = BusMode.FULL;
    }

    @Override
    public void refuel(double quantity) {

        boolean isValidQuantity = Validator.validateRefuelQuantity(this.getFuelReserve(), this.getTankCapacity(), quantity);

        if (isValidQuantity) {
            this.setFuelReserve(quantity + this.getFuelReserve());
        }
    }

    public void switchBusMode(String state) {
        if (state.equals("DriveEmpty")) {
            this.busMode = BusMode.EMPTY;
        } else if (state.equals("Drive")) {
            this.busMode = BusMode.FULL;
        }
    }

    public BusMode getBusMode() {
        return this.busMode;
    }

    @Override
    public double getActualFuelConsumption() {
        if (this.getAirConditionerMode().toString().equals("ON") && this.busMode.toString().equals("FULL")) {
            return this.getFuelConsumption() + 1.4;
        } else {
            return this.getFuelConsumption();
        }
    }
}

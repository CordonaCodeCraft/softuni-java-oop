package polymorphism.exercises.vehicles.models;

import polymorphism.exercises.vehicles.utils.PrinterReport;

public class Truck extends VehicleImpl {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
        this.setVehicleType(this.getClass().getSimpleName());
    }

    @Override
    public void refuel(double fuelAdded) {

        double fuelLost = fuelAdded * 5 / 100;
        double actualFuelRefill = fuelAdded - fuelLost;

        double updatedFuelQuantity = this.getFuelQuantity() + actualFuelRefill;

        this.setFuelQuantity(updatedFuelQuantity);
    }

    @Override
    public void reportAvailableFuel() {
        PrinterReport.availableFuel(this.getVehicleType(), this.getFuelQuantity());
    }


}

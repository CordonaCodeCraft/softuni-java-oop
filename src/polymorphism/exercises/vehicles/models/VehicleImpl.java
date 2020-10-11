package polymorphism.exercises.vehicles.models;

import polymorphism.exercises.vehicles.interfaces.Drivable;
import polymorphism.exercises.vehicles.interfaces.Refuable;
import polymorphism.exercises.vehicles.interfaces.Vehicle;
import polymorphism.exercises.vehicles.utils.PrinterReport;

public abstract class VehicleImpl implements Vehicle, Drivable, Refuable {

    private String VEHICLE_TYPE;
    private final double FUEL_CONSUMPTION;
    private double fuelQuantity;

    public VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.FUEL_CONSUMPTION = fuelConsumption;
    }


    public void drive(double distance) {

        double fuelNeeded = this.FUEL_CONSUMPTION * distance;

        if (fuelNeeded > fuelQuantity) {
            PrinterReport.needsMoreFuel(this.VEHICLE_TYPE);
        } else {
            this.setFuelQuantity(fuelQuantity - fuelNeeded);
            PrinterReport.coveredDistance(this.VEHICLE_TYPE, distance);
        }

    }

    public String getVehicleType() {
        return this.VEHICLE_TYPE;
    }

    public void setVehicleType(String type) {
        this.VEHICLE_TYPE = type;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double quantity) {
        this.fuelQuantity = quantity;
    }

    @Override
    public void reportAvailableFuel() {
        PrinterReport.availableFuel(this.VEHICLE_TYPE, this.fuelQuantity);
    }

 }

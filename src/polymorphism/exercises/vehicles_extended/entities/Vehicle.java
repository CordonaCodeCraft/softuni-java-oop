package polymorphism.exercises.vehicles_extended.entities;

import polymorphism.exercises.vehicles_extended.enums.AirConditionerMode;
import polymorphism.exercises.vehicles_extended.service.impl.VehicleServiceImpl;

public abstract class Vehicle extends VehicleServiceImpl {
    private final String VEHICLE_TYPE;
    private final double TANK_CAPACITY;
    private final double FUEL_CONSUMPTION;
    private double fuelReserve;
    private AirConditionerMode airConditionerMode;

    public Vehicle(double fuelReserve, double fuelConsumption, double tankCapacity) {
        this.VEHICLE_TYPE = this.getClass().getSimpleName();
        this.FUEL_CONSUMPTION = fuelConsumption;
        this.TANK_CAPACITY = tankCapacity;
        this.fuelReserve = fuelReserve;
        this.airConditionerMode = AirConditionerMode.ON;
    }

    public AirConditionerMode getAirConditionerMode() {
        return this.airConditionerMode;
    }

    public void setAirConditionerMode(AirConditionerMode airConditionerMode) {
        this.airConditionerMode = airConditionerMode;
    }

    public String getVehicleType() {
        return this.VEHICLE_TYPE;
    }

    public double getTankCapacity() {
        return this.TANK_CAPACITY;
    }

    public double getFuelReserve() {
        return this.fuelReserve;
    }

    public void setFuelReserve(double fuelReserve) {
        this.fuelReserve = fuelReserve;
    }

    public double getFuelConsumption() {
        return this.FUEL_CONSUMPTION;
    }

    public String getFuelReport() {
        return String.format("%s: %.2f", this.VEHICLE_TYPE, this.fuelReserve);
    }

}

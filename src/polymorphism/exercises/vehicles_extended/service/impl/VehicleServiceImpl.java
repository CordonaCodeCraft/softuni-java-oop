package polymorphism.exercises.vehicles_extended.service.impl;

import polymorphism.exercises.vehicles_extended.entities.Vehicle;
import polymorphism.exercises.vehicles_extended.enums.AirConditionerMode;
import polymorphism.exercises.vehicles_extended.service.VehicleService;
import polymorphism.exercises.vehicles_extended.utils.Report;

public abstract class VehicleServiceImpl implements VehicleService {

    @Override
    public void drive(Vehicle vehicle, double distance) {

        double fuelConsumption = vehicle.getActualFuelConsumption();
        double availableFuel = vehicle.getFuelReserve();
        String vehicleType = vehicle.getClass().getSimpleName();

        double fuelNeeded = distance * fuelConsumption;

        if (fuelNeeded > availableFuel) {
            Report.InsufficientFuelReserve(vehicleType);
        } else {
            Report.coveredDistance(vehicleType, distance);
            vehicle.setFuelReserve(availableFuel - fuelNeeded);
        }
    }

    public void switchAirConditionerMode(Vehicle vehicle) {
        if (vehicle.getAirConditionerMode().toString().equals("ON")) {
            vehicle.setAirConditionerMode(AirConditionerMode.OFF);
        } else {
            vehicle.setAirConditionerMode(AirConditionerMode.ON);
        }
    }
}

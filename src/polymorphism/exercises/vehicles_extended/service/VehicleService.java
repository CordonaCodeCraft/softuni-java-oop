package polymorphism.exercises.vehicles_extended.service;

import polymorphism.exercises.vehicles_extended.entities.Vehicle;

public interface VehicleService {

    void drive(Vehicle vehicle, double distance);

    void refuel(double quantity);

    double getActualFuelConsumption();

    void switchAirConditionerMode(Vehicle vehicle);

}

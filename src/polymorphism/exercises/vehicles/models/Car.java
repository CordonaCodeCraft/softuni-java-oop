package polymorphism.exercises.vehicles.models;

public class Car extends VehicleImpl {

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
        this.setVehicleType(this.getClass().getSimpleName());
    }

    @Override
    public void refuel(double fuelAdded) {

        double updatedFuelQuantity = this.getFuelQuantity() + fuelAdded;

        this.setFuelQuantity(updatedFuelQuantity);

    }


}

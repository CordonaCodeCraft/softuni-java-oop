package polymorphism.exercises.vehicles_extended.utils;

import java.text.DecimalFormat;

public class Report {

    public static void InsufficientFuelReserve(String vehicleType) {
        System.out.println(String.format("%s needs refueling", vehicleType));
    }

    public static void coveredDistance(String vehicleType, double distance) {
        DecimalFormat pattern = new DecimalFormat("0.#");
        System.out.println(String.format("%s travelled %s km", vehicleType, pattern.format(distance)));
    }

    public static void invalidRefuelQuantity() {
        System.out.println("Fuel must be a positive number");
    }

    public static void notEnoughTankCapacity() {
        System.out.println("Cannot fit fuel in tank");
        
    }
}

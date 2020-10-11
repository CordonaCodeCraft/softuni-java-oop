package polymorphism.exercises.vehicles.utils;

import java.text.DecimalFormat;

public class PrinterReport {

    public static void coveredDistance(String vehicleType, double kilometers) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        System.out.println(String.format("%s travelled %s km", vehicleType, decimalFormat.format(kilometers)));
    }

    public static void needsMoreFuel(String vehicleType) {
        System.out.println(String.format("%s needs refueling", vehicleType));
    }

    public static void availableFuel(String vehicleType, double currentFuelQuantity) {
        System.out.println(String.format("%s: %.2f",vehicleType, currentFuelQuantity));
    }

}

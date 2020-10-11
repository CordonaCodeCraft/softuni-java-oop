package polymorphism.exercises.vehicles;

import polymorphism.exercises.vehicles.interfaces.Vehicle;
import polymorphism.exercises.vehicles.models.Car;
import polymorphism.exercises.vehicles.models.Truck;
import polymorphism.exercises.vehicles.models.VehicleImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static List<VehicleImpl> VEHICLES = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        constructVehicles(scanner);
        useVehicles(scanner);
        printFuelReports();
        

    }

    private static void constructVehicles(Scanner scanner) {

        for (int i = 0; i < 2; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String vehicleType = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double fuelConsumption = Double.parseDouble(tokens[2]);

            switch (vehicleType) {
                case "Car":
                    VEHICLES.add(new Car(fuel, fuelConsumption));
                    break;
                case "Truck":
                    VEHICLES.add(new Truck(fuel, fuelConsumption));
                    break;
            }
        }
    }

    private static void useVehicles(Scanner scanner) {
        int useCaseCount = Integer.parseInt(scanner.nextLine());

        while (--useCaseCount >= 0) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String useCase = tokens[0];
            String vehicleType = tokens[1];

            switch (useCase) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);

                    for (VehicleImpl vehicle : VEHICLES) {
                        if (vehicle.getClass().getSimpleName().equals(vehicleType)) {
                            vehicle.drive(distance);
                        }
                    }
                    break;
                case "Refuel":
                    double quantity = Double.parseDouble(tokens[2]);

                    for (VehicleImpl vehicle : VEHICLES) {
                        if (vehicle.getClass().getSimpleName().equals(vehicleType)) {
                            vehicle.refuel(quantity);
                        }
                    }
                    break;
            }
        }
    }

    private static void printFuelReports() {
        VEHICLES.forEach(Vehicle::reportAvailableFuel);
    }

}

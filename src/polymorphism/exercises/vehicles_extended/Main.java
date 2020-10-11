package polymorphism.exercises.vehicles_extended;

import polymorphism.exercises.vehicles_extended.entities.Bus;
import polymorphism.exercises.vehicles_extended.entities.Car;
import polymorphism.exercises.vehicles_extended.entities.Truck;
import polymorphism.exercises.vehicles_extended.entities.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Vehicle> VEHICLES = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        generateVehicles(scanner);
        executeCommands(scanner);
        VEHICLES
                .forEach(vehicle -> System.out.println(vehicle.getFuelReport()));

    }

    private static void generateVehicles(Scanner scanner) {

        for (int i = 0; i < 3; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String vehicleType = tokens[0];
            double fuelReserve = Double.parseDouble(tokens[1]);
            double fuelConsumption = Double.parseDouble(tokens[2]);
            double tankCapacity = Double.parseDouble(tokens[3]);

            switch (vehicleType) {

                case "Car":
                    VEHICLES.add(new Car(fuelReserve, fuelConsumption, tankCapacity));
                    break;
                case "Truck":
                    VEHICLES.add(new Truck(fuelReserve, fuelConsumption, tankCapacity));
                    break;
                case "Bus":
                    VEHICLES.add(new Bus(fuelReserve, fuelConsumption, tankCapacity));
                    break;
            }

        }
        
    }

    private static void executeCommands(Scanner scanner) {

        int commandsCount = Integer.parseInt(scanner.nextLine());

        while (--commandsCount >= 0) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String command = tokens[0];
            String targetType = tokens[1];
            double parameter = Double.parseDouble(tokens[2]);

            for (Vehicle vehicle : VEHICLES) {
                if (vehicle.getVehicleType().equals(targetType)) {
                    switch (command) {
                        case "Drive":
                            if (targetType.equals("Bus")) {
                                ((Bus) vehicle).switchBusMode(command);
                                vehicle.drive(vehicle, parameter);
                            } else {
                                vehicle.drive(vehicle, parameter);
                            }
                            break;
                        case "DriveEmpty":
                            ((Bus) vehicle).switchBusMode(command);
                            vehicle.drive(vehicle, parameter);
                            break;
                        case "Refuel":
                            vehicle.refuel(parameter);
                            break;

                    }
                    break;
                }
            }
        }
    }
}

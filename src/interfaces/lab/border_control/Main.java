package interfaces.lab.border_control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static List<Identifiable> VISITORS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            } else {
                String[] tokens = input.split("\\s+");
                createVisitor(tokens);

            }
        }
        String fakeID = scanner.nextLine();

        VISITORS
                .stream()
                .map(Identifiable::getID)
                .filter(ID -> ID.substring(ID.length() -3).contains(fakeID))
                .forEach(System.out::println);

    }

    private static void createVisitor(String[] tokens) {
        String name = tokens[0];

        if (name.contains("-")) {
            String ID = tokens[1];
            Robot robot = new Robot(name, ID);
            VISITORS.add(robot);
        } else {
            int age = Integer.parseInt(tokens[1]);
            String ID = tokens[2];
            Citizen citizen = new Citizen(name, age, ID);
            VISITORS.add(citizen);
        }
    }
}

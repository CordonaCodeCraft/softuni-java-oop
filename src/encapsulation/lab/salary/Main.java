package encapsulation.lab.salary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Person> PERSONS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        while (--count >= 0) {

            String[] tokens = scanner.nextLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);

            try {
                Person person = new Person(firstName, lastName, age, salary);
                PERSONS.add(person);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        double percentage = Double.parseDouble(scanner.nextLine());

        for (Person person : PERSONS) {
            person.increaseSalary(percentage);
            System.out.println(person.toString());
        }

    }
}

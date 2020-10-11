package encapsulation.lab.sort_by_name_and_age;

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
            Integer age = Integer.parseInt(tokens[2]);
            Person person = new Person(firstName, lastName, age);
            PERSONS.add(person);
        }

        PERSONS.sort(new ComparatorByAge());

        for (Person person : PERSONS) {
            System.out.println(person.toString());
        }
    }
    
}

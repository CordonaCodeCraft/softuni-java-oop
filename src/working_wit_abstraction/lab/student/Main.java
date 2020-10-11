package working_wit_abstraction.lab.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Exit")) {
                break;
            } else {
                String[] tokens = input.split("\\s+");
                String command = tokens[0];
                switch (command) {
                    case "Create":
                        studentSystem.addStudentToRepository(tokens);
                        break;
                    case "Show":
                        studentSystem.printStudent(tokens);
                }
            }
//            studentSystem.ParseCommand(input);
        }
    }
}

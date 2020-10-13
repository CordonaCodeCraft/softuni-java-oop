package polymorphism.exercises.calculator;

import polymorphism.exercises.calculator.model.Calculator;
import polymorphism.exercises.calculator.utils.Processor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        Processor.processInput(calculator, tokens);

        System.out.println(calculator.getResult());

    }

}

package interfaces.exercises.telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersTokens = buildArray(scanner);

        List<String> numbers = buildList(numbersTokens);

        String[] urlsTokens = buildArray(scanner);

        List<String> urls = buildList(urlsTokens);

        Smartphone smartphone = new Smartphone(numbers, urls);

        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());



    }

    private static List<String> buildList(String[] tokens) {
        return new ArrayList<>(Arrays.asList(tokens));
    }

    private static String[] buildArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }
}

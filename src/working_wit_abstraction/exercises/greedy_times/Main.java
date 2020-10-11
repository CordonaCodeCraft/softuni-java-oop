package working_wit_abstraction.exercises.greedy_times;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String capacity = scanner.nextLine();
        Bag bag = new Bag(capacity);
        String vaultContent = scanner.nextLine();
        Vault vault = new Vault();
        VaultSorter sorter = new VaultSorter(vault);
        sorter.process(vaultContent);
        Looter looter = new Looter(vault, bag);
        looter.fillBag();
        Printer printer = new Printer(vault, bag);
        printer.print();

    }
}

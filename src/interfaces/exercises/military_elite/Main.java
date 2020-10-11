package interfaces.exercises.military_elite;

import interfaces.exercises.military_elite.utils.SoldierFactory;
import interfaces.exercises.military_elite.utils.SoldiersRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            } else {
                SoldierFactory.constructSoldier(input);
            }
        }
        
        SoldiersRepository.getSoldiers()
                .values()
                .forEach(soldier -> System.out.println(soldier.toString()));

    }
}

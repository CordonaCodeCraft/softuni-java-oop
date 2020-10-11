package encapsulation.lab.first_and_reserve_team;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Team team = new Team("Black Eagles");

        while (--count >= 0)  {
            String[] tokens = scanner.nextLine().split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);
            Person player = new Person(firstName,lastName,age,salary);
            team.addPlayer(player);
        }

        int firstTeamSize = team.getFirstTeam().size();
        int reserveTeamSize = team.getReserveTeam().size();

        System.out.printf("First team have %d players%n", firstTeamSize);
        System.out.printf("Reserve team have %d players", reserveTeamSize);
    }
}

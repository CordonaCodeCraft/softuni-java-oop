package encapsulation.exercises.football_team_generator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    private final static Deque<String> TOKENS_QUEUE = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] teamTokens = scanner.nextLine().split(";");
        String teamName = teamTokens[1];

        try {
            Team team = new Team(teamName);

            while (true) {
                String input = scanner.nextLine();

                if (input.equals("END")) {
                    break;
                } else {
                    feedTokensQueue(input);
                    String command = TOKENS_QUEUE.remove();
                    switch (command) {
                        case "Add": {
                            String targetTeam = TOKENS_QUEUE.remove();

                            if (isValidObject(targetTeam, teamName)) {
                                try {
                                    Player player = createPlayer();
                                    team.addPlayer(player);
                                } catch (IllegalArgumentException exception) {
                                    System.out.println(exception.getMessage());
                                }
                            } else {
                                System.out.printf("Team %s does not exist.%n", targetTeam);
                            }
                            break;
                        }
                        case "Remove": {
                            String targetTeam = TOKENS_QUEUE.remove();
                            String playerName = TOKENS_QUEUE.remove();

                            if (isValidObject(targetTeam, targetTeam)) {
                                try {
                                    team.removePlayer(playerName);
                                } catch (IllegalArgumentException exception) {
                                    System.out.println(exception.getMessage());
                                }
                            }
                            break;
                        }
                        case "Rating":
                            String targetTeam = TOKENS_QUEUE.remove();

                            if (isValidObject(teamName, targetTeam)) {
                                System.out.printf("%s - %.0f%n", team.getName(), team.getRating());
                            } else {
                                System.out.printf("Team %s does not exist.%n", targetTeam);
                            }
                            break;
                    }
                }
                TOKENS_QUEUE.clear();
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void feedTokensQueue(String input) {
        String[] tokens = input.split(";");

        for (String token : tokens) {
            TOKENS_QUEUE.offer(token);
        }
    }

    private static Player createPlayer() {
        String name = TOKENS_QUEUE.remove();
        int endurance = Integer.parseInt(TOKENS_QUEUE.remove());
        int sprint = Integer.parseInt(TOKENS_QUEUE.remove());
        int dribble = Integer.parseInt(TOKENS_QUEUE.remove());
        int passing = Integer.parseInt(TOKENS_QUEUE.remove());
        int shooting = Integer.parseInt(TOKENS_QUEUE.remove());

        return new Player(name, endurance, sprint, dribble, passing, shooting);

    }

    private static boolean isValidObject(String targetTeam, String teamName) {
        return targetTeam.equals(teamName);

    }

}

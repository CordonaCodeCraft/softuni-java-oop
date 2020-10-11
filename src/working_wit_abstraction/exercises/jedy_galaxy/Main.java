package working_wit_abstraction.exercises.jedy_galaxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String galaxyDimensions = scanner.nextLine();
        Galaxy galaxy = new Galaxy(galaxyDimensions);
        Jeddy jeddy = new Jeddy(galaxy);
        Evil evil = new Evil(galaxy);

        while (true) {
            String jeddyCoordinates = scanner.nextLine();
            if (jeddyCoordinates.equals("Let the Force be with you")) {
                break;
            } else {
                String evilCoordinates = scanner.nextLine();
                evil.collectStars(evilCoordinates);
                jeddy.collectStars(jeddyCoordinates);
            }
        }

        System.out.println(jeddy.getTotal());
    }
}



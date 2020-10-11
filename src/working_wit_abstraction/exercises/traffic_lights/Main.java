
// Judge ready

package working_wit_abstraction.exercises.traffic_lights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<TrafficLight> TRAFFIC_LIGHTS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Arrays
                .stream(s.nextLine().split("\\s+"))
                .map(TrafficLight::new)
                .forEach(TRAFFIC_LIGHTS::add);

        int count = Integer.parseInt(s.nextLine());

        while (--count >= 0) {
            TRAFFIC_LIGHTS
                    .forEach(TrafficLight::changeColor);

            TRAFFIC_LIGHTS
                    .forEach(e -> System.out.printf("%s ", e.getColor()));

            System.out.println();
        }
    }
}

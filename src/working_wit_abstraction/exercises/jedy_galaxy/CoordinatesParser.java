package working_wit_abstraction.exercises.jedy_galaxy;

import java.util.Arrays;

public class CoordinatesParser {

    public static int[] parse(String input) {
        return Arrays
                .stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

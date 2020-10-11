
// Judge ready

package working_wit_abstraction.lab.point_in_rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Point> points = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rectangle rectangle = createRectangle(s);
        generatePoints(s);
        points.forEach(point -> System.out.println(rectangle.contains(point)));
    }

    private static Rectangle createRectangle(Scanner s) {
        int[] rectangleTokens = aggregateTokens(s);

        return new Rectangle(rectangleTokens);
    }

    private static void generatePoints(Scanner s) {
        int pointsCount = Integer.parseInt(s.nextLine());

        while (--pointsCount >= 0) {
            int[] pointsTokens = aggregateTokens(s);
            points.add(new Point(pointsTokens));
        }
    }

    private static int[] aggregateTokens(Scanner s) {
        return Arrays
                .stream(s.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

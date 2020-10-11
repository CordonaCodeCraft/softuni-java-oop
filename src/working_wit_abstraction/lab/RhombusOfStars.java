
// Judge ready

package working_wit_abstraction.lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RhombusOfStars {
    private static final Deque<String> rhombusFirstHalfAggregator = new ArrayDeque<>();
    private static final StringBuilder rhombusSecondHalfAggregator = new StringBuilder();

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int centerRowSymbolsCount = Integer.parseInt(s.nextLine());

        String centerRow = generateCenterRow(centerRowSymbolsCount);

        aggregateRhombus(centerRowSymbolsCount, centerRow);

        printRhombusFirstHalf();

        System.out.print(rhombusSecondHalfAggregator.toString());

    }

    private static String generateCenterRow(int centerRowSymbolsCount) {

        StringBuilder centerRowBuilder = new StringBuilder();

        while (--centerRowSymbolsCount >= 0) {
            if (centerRowSymbolsCount <= 0) {
                centerRowBuilder.append("*");
            } else {
                centerRowBuilder
                        .append("*")
                        .append(" ");
            }
        }
        return centerRowBuilder.toString();
    }

    private static void aggregateRhombus(int centerRowSymbolsCount, String centerRow) {

        rhombusSecondHalfAggregator
                .append(centerRow)
                .append(System.lineSeparator());

        String line = centerRow;

        int firstStarIndex = line.indexOf("*");
        int lastStarIndex = line.lastIndexOf("*");

        while (--centerRowSymbolsCount >= 0) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                if (i < firstStarIndex || i > lastStarIndex) {
                    lineBuilder.append(" ");
                } else if (line.charAt(i) == ' ') {
                    lineBuilder.append("*");
                } else if (line.charAt(i) == '*') {
                    lineBuilder.append(" ");
                }
            }

            rhombusFirstHalfAggregator.push(line);

            rhombusSecondHalfAggregator
                    .append(line)
                    .append(System.lineSeparator());

            line = lineBuilder.toString();
            firstStarIndex = line.indexOf("*");
            lastStarIndex = line.lastIndexOf("*");
        }
    }

    private static void printRhombusFirstHalf() {

        rhombusFirstHalfAggregator.pop();

        while (!rhombusFirstHalfAggregator.isEmpty()) {
            System.out.println(rhombusFirstHalfAggregator.pop());
        }

    }
}

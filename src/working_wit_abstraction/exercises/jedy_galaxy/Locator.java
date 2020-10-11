package working_wit_abstraction.exercises.jedy_galaxy;

public class Locator {

    public static String locateDiagonalStartPosition(Galaxy galaxy, String forceType, String input) {

        int[] startCoordinates = CoordinatesParser.parse(input);

        int counter = startCoordinates[0];
        int startRow = startCoordinates[0];
        int startColumn = startCoordinates[1];
        int matrixEndRow = galaxy.getRowsCount() - 1;
        int matrixEndColumn = galaxy.getColumnsCount() - 1;

        boolean rowInsideTheMatrix = false;
        boolean columnInsideTheMatrix = false;
        boolean diagonalWillCrossGalaxy = false;

        while (counter >= 0) {

            rowInsideTheMatrix = startRow <= matrixEndRow && startRow >= 0;

            columnInsideTheMatrix = startColumn >= 0 && startColumn <= matrixEndColumn;

            if (rowInsideTheMatrix && columnInsideTheMatrix) {
                diagonalWillCrossGalaxy = true;
                break;
            } else {
                counter--;
                startRow--;
                if (forceType.equals("Jeddy")) {
                    startColumn++;
                } else {
                    startColumn--;
                }
            }
        }

        if (diagonalWillCrossGalaxy) {
            return String.format("%d %d", startRow, startColumn);
        }  else {
            return "No position";
        }

    }

}

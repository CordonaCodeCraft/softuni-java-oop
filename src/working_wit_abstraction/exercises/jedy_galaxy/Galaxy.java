package working_wit_abstraction.exercises.jedy_galaxy;

public class Galaxy {
    private final int rowsCount;
    private final int columnsCount;
    private final int[][] galaxy;

    public Galaxy(String input) {
        int[] dimensions = CoordinatesParser.parse(input);
        this.rowsCount = dimensions[0];
        this.columnsCount = dimensions[1];
        this.galaxy = new int[this.rowsCount][this.columnsCount];
        generateStars();
    }

    private void generateStars() {
        int number = 0;
        for (int row = 0; row < this.rowsCount; row++) {
            for (int column = 0; column < this.columnsCount; column++) {
                this.galaxy[row][column] = number++;
            }
        }
    }

    public int getRowsCount() {
        return this.rowsCount;
    }

    public int getColumnsCount() {
        return this.columnsCount;
    }

    public int[][] getGalaxy() {
        return this.galaxy;
    }
}

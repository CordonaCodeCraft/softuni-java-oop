package working_wit_abstraction.exercises.jedy_galaxy;

public class Jeddy {
    private final Galaxy galaxy;
    private long total;

    public Jeddy(Galaxy galaxy) {
        this.galaxy = galaxy;
        this.total = 0;
    }

    public void collectStars(String input) {
        String forceType = "Jeddy";
        String diagonalReport = Locator.locateDiagonalStartPosition(galaxy, forceType, input);

        if (!diagonalReport.equals("No position")) {
            int[] coordinates = CoordinatesParser.parse(diagonalReport);
            int row = coordinates[0];
            int column = coordinates[1];

            for (int currentRow = row; currentRow >= 0; currentRow--) {
                boolean nextStarInsideGalaxy = currentRow >= 0 && column < this.galaxy.getColumnsCount();
                if (nextStarInsideGalaxy) {
                    this.total += this.galaxy.getGalaxy()[currentRow][column];

                }
                column++;
            }
        }
    }

    public long getTotal() {
        return this.total;
    }

}




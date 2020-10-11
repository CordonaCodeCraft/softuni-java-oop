package working_wit_abstraction.exercises.jedy_galaxy;

public class Evil {
    private final Galaxy galaxy;

    public Evil(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void collectStars(String input) {
        String forceType = "Evil";
        String diagonalReport = Locator.locateDiagonalStartPosition(galaxy, forceType, input);

        if (!diagonalReport.equals("No position")) {
            int[] coordinates = CoordinatesParser.parse(diagonalReport);
            int row = coordinates[0];
            int column = coordinates[1];

            for (int currentRow = row; currentRow >= 0; currentRow--) {
                boolean starInsideGalaxy = currentRow >= 0 && column >= 0;
                if (starInsideGalaxy) {
                    this.galaxy.getGalaxy()[currentRow][column] = 0;
                }
                column--;

            }

        }
    }

}

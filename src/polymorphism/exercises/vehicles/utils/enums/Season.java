package polymorphism.exercises.vehicles.utils.enums;

public enum  Season {
    SUMMER("Summer");

    private final String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return this.seasonName;
    }
}

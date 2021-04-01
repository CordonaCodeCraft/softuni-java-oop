package solid.exercises.logger.enums;

public enum LayoutType {
    SIMPLE("SimpleLayout"),
    XML("XmlLayout");

    private final String name;

    LayoutType(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }
}

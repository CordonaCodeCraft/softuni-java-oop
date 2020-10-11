package interfaces.lab.border_control;

public class Robot implements Identifiable {
    private final String id;
    private final String model;

    public Robot(String model, String id) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String getID() {
        return this.id;
    }
}

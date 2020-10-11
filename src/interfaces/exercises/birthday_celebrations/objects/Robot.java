package interfaces.exercises.birthday_celebrations.objects;

import interfaces.exercises.birthday_celebrations.interfaces.Identifiable;

public class Robot implements Identifiable {
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getID() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }
}

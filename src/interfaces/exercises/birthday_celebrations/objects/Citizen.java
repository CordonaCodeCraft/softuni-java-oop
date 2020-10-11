package interfaces.exercises.birthday_celebrations.objects;

import interfaces.exercises.birthday_celebrations.interfaces.Birthable;
import interfaces.exercises.birthday_celebrations.interfaces.Identifiable;

public class Citizen implements Identifiable, Birthable {
    private final String name;
    private final int age;
    private final String id;
    private final String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}

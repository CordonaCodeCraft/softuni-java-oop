package interfaces.exercises.birthday_celebrations.objects;

import interfaces.exercises.birthday_celebrations.interfaces.Birthable;

public class Pet implements Birthable {
    private final String name;
    private final String birthDate;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthDate = birthDay;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}

package interfaces.exercises.multiple_implementation;

public class Citizen implements Person, Identifiable, Birthable {
    private final String name;
    private final int age;
    private final String id;
    private final String birthDay;

    public Citizen(String name, int age, String id, String birthDay) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDay;
    }

    @Override
    public String getID() {
        return this.id;
    }
}

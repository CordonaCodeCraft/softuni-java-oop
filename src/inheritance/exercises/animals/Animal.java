package inheritance.exercises.animals;

public class Animal {
    private final String name;
    private final Integer age;
    private String gender;

    public Animal(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String produceSound() {
        return "sound";
    }


    @Override
    public String toString() {

        return this.getClass().getSimpleName() + System.lineSeparator() +
                String.format("%s %d %s", this.getName(), this.getAge(), this.getGender());
    }
}

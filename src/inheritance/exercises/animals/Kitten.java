package inheritance.exercises.animals;

public class Kitten extends Cat {

    public Kitten(String name, Integer age, String gender) {
        super(name, age, gender);
        super.setGender("Female");
    }

    public String produceSound() {
        return "Meow";
    }
}

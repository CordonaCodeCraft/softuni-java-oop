package inheritance.exercises.animals;

public class Tomcat extends Cat {
    public Tomcat(String name, Integer age, String gender) {
        super(name, age, gender);
        super.setGender("Male");
    }

    public String produceSound() {
        return "MEOW";
    }
}
